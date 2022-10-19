package step4_01.string;

//2022-10-19 오후 5시 35분 ~

//# 문자열 1차원

public class StringEx06_풀이 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		String score1 = str.substring(0, 2);
		String score2 = str.substring(3, 6);
		String score3 = str.substring(7);
		
		int nScore1 = Integer.parseInt(score1);
		int nScore2 = Integer.parseInt(score2);
		int nScore3 = Integer.parseInt(score3);
		
		arr[0] = nScore1;
		arr[1] = nScore2;
		arr[2] = nScore3;
		
		System.out.println("총 점수: " + nScore1 + nScore2 + nScore3);
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";


	}

}
