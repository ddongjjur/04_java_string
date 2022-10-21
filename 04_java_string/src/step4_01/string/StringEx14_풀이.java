package step4_01.string;

//2022-10-21 오후 4시 39분 ~ 오후 4시 41분

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class StringEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		
		if (myName.compareTo(name) > 0 || myName.compareTo(name) < 0) {
			System.out.println("출력 = false");
		}
		
		else {
			System.out.println("출력 = true");
		}
		
		scan.close();
	}

}
