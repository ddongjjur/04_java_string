package step4_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_풀이 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		String[] temp = {"","","","",""};
		
		for (int i = 0; i < names.length; i++) {
			if (i <= 3) {
				names[i].compareTo(names[i + 1]);
			}
			else if (i == 4) {
				names[i].compareTo(names[0]);
			}
			
		}
		
	}

}
