package step4_01.string;

//2022-10-21 오후 4시 19분 ~ 오후 4시 38분

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_풀이 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		String[] temp = {"","","","",""};
		
		for (int i = 0; i < names.length; i++) {
			if (i <= 3) {
				if (names[i].compareTo(names[i + 1]) < 0) {
					names[i] = temp[i];
					names[i + 1] = temp[i + 1];
				}
				else if (names[i].compareTo(names[i + 1]) > 0) {
					temp[i] = names[i + 1];
					temp[i + 1] = names[i];
					names[i] = temp[i];
					names[i + 1] = temp[i + 1];
				}
			}
			
		}
		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[j]);
		}
	}

}
