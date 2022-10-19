package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String dbId = "admin";
		
		System.out.print("# 아이디를 입력하세요: ");
		String getId = scan.next();
		
		// '==' 연산자 비교 불가...
		
		if (dbId == getId)	System.out.println("== 연산자 아이디 일치");
		else 				System.out.println("== 연산자 아이디 불일치");
		
		if (dbId.equals(getId))	System.out.println("equals 메서드 아이디 일치");
		else					System.out.println("equals 메서드 아이디 불일치");
		
		
		scan.close();
		
	}
	
}
