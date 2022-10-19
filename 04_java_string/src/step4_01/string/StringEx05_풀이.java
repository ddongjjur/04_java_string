package step4_01.string;

//2022-10-19 오후 5시 20분 ~ 오후 5시 34분


public class StringEx05_풀이 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 34세
		
		String age = jumin.substring(0, 2);
		int nAge = Integer.parseInt(age);
		
		
		System.out.println("나이: " + (2022 - nAge - 1900 + 1) + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char gender = jumin.charAt(7);
		
		if (gender == '2') {
			System.out.println("여성");
		}
		
		else if (gender == '1') {
			System.out.println("남성");
		}
		
	}

}
