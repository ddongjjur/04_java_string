package step4_01.string;

import java.util.Random;

//2022-10-22 오후 12시 53분 ~

import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료 

*/
public class StringEx18_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int[] check = new int[size];  // 힌트 체크를 통해서 확인할수있다.
		Random ran = new Random();
		String hint = "";
		
		while (true) {
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				System.out.print("*");
				
			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			if (!word.equals(me)) {
				int random = ran.nextInt(word.length() - 1);
				
				for (int i = 0; i < word.length(); i++) {
					char ch = word.charAt(i);
					
					if (random == i) {
						System.out.println(ch);
					}
				}
			}
		}

	}

}
