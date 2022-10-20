package step4_01.string;

import java.util.Scanner;

//2022-10-20 오후 3시 49분 ~ 오후 4시 07분

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isRun = true;
		String start = "자전거";
		String end = "quit";
		
		while (isRun) {
			
			System.out.println("제시어 : " + start);
			
			System.out.print("입력: ");
			String input = scan.next();
			
			if (start.charAt(start.length() - 1) == input.charAt(0)) {
				start = input;
			}
			
			if (end.equals(input)) {
				System.out.println();
				System.out.println("- 종료 -");
				isRun = false;
			}
			
		}
		
	}

}
