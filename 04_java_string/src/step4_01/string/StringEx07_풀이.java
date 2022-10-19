package step4_01.string;

//2022-10-19 오후 11시 39분 ~ 오후11시 53분

public class StringEx07_풀이 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
				
		String[] seperate1 = str.split(",");
		
		for (int i = 0; i < seperate1.length; i++) {
			String[] seperate2 = seperate1[i].split("/");
			name[i] = seperate2[0];
			score[i] = Integer.parseInt(seperate2[1]);
		}
		
		for (int i = 0; i < seperate1.length; i++) {
			System.out.println("이름: " + name[i]);
			System.out.println("성적: " + score[i]);
		}
	}

}
