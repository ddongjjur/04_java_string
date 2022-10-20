package step4_01.string;

import java.util.Random;
import java.util.Scanner;

//2022-10-20 오후 3시 06분 ~ 오후 3시 48분

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_풀이 {

	public static void main(String[] args) {
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for (int i = 0; i < 100; i++) {
			int ranNumber = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[ranNumber];
			words[ranNumber] = temp;
		}
		
		for (int i = 0; i < words.length; i++) {
			
			System.out.println("[" + (i + 1) + "]" + "문제: " + words[i]);
			System.out.print("입력: ");
			String answer = scan.next();
			
			//if (!words[i].equals(answer)){
			if (words[i].equals(answer) == false) {
				i -= 1;
				continue;
			}
			
			else if (words[i].equals(answer)) {
				System.out.println("정답입니다.");
			}
			
			
		}
		
		scan.close();
	}

}
