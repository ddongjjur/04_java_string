package step4_01.string;

//2022-10-21 오후 5시 05분 ~ 오후 5시 26분

import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		String[] textHub = text.split(" ");
		int existence = 0;
		
		for (int i = 0; i < 4; i++) {
			if (word.equals(textHub[i])) {
				existence = 1;
			}
		}
		
		if (existence == 1) System.out.println("true");
		else System.out.println("false");
		
		scan.close();
	}

}
