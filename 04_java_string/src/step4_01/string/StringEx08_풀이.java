package step4_01.string;

//2022-10-19 오후 11시 54분 ~ 오후 12시 03분

public class StringEx08_풀이 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
				
		for (int i = 0; i < score.length; i++) {
			if (i <= score.length - 2) {
				str += name[i] + "/" + score[i] + ", ";
			}
			else if (i == score.length - 1) {
				str += name[i] + "/" + score[i];
			}
		}
		System.out.println(str);

	}

}
