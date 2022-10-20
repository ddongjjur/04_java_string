package step4_01.string;

//2022-10-19 오후 5시 35분 ~ 오후 5시 47분

//# 문자열 1차원

public class StringEx06_풀이 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		int total = 0;
		
		String[] score = str.split("/");
		
		for (int i = 0; i < score.length; i++) {
			arr[i] = Integer.parseInt(score[i]);
			total += arr[i];
		}
		
		System.out.println("총점: " + total);
		System.out.println();
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for (int i = 0; i < scores.length; i++) {
			if (i < scores.length - 1)	text += scores[i] + "/";
			else if (i < score.length)	text += score[i];
				
		}
		System.out.println(text);
	}

}
