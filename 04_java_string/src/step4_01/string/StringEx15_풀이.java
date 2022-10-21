package step4_01.string;

//2022-10-21 오후 4시 44분 ~ 오후 5시 04분

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		int textMsg = 0; // 1이면 문자, 2면 숫자 3이면 숫자와 문자
		int number = 0;
		int i = 0;
		
		while (i < text.length()) {
			
		//for (int i = 0; i < text.length(); i++) {
			int ch = text.charAt(i);
			
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				textMsg = 1;
			}
			
			else if (ch >= 48 && ch <= 57) {
				number = 1;
			}
			
			else if (ch >= 65 && ch <= 90 && ch >= 97 && ch <= 122 && ch >= 48 && ch <= 57) {
				number = 1;
				textMsg = 1;
			}
			
			i++;
		}
		
		if (textMsg == 1 && number == 0) System.out.println("문자만 있다.");
		else if (number == 1 && textMsg == 0) System.out.println("숫자만 있다.");
		else if (textMsg == 1 && number == 1) System.out.println("숫자와 문자가 섞여 있다.");
		else if (textMsg == 0 && number == 0) System.out.println("숫자와 영어만 입력하세요.");
			
	}

}
