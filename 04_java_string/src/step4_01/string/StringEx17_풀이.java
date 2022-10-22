package step4_01.string;

//2022-10-21 오후 5시 26분 ~ 오후 10시 00분

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word1 = scan.nextLine();
		
		System.out.print("바꿀 단어 입력: ");
		String word2 = scan.nextLine();
		
		String[] textHub = text.split(" ");
		String temp = new String();
		
		String w1 = textHub[0];
		String w2 = textHub[1];
		String w3 = textHub[2];
		String w4 = textHub[3];
		
		for (int i = 0; i < textHub.length; i++) {
			
			
			if (word1.equals(textHub[i])) {
				temp = textHub[i];
				textHub[i] = word2;
			}
			
			else if (word2.equals(textHub[i])) {
				textHub[i] = temp;
			}
		}
		for (int i = 0; i < textHub.length; i++) {
			System.out.print(textHub[i] + " ");
		}
		
	}

}
