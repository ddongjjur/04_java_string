package step4_01.string;

//2022-10-20 오후 5시 16분 ~ 오후 10시 5분

import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */



public class StringEx12_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;
		int loginOk = -1;
		
		while(true) {
			
			System.out.print("상태: ");
			if (loginOk != -1) System.out.println(ids[identifier] + "님 로그인 중 \n");
			if (loginOk == -1) System.out.println("로그아웃\n");
			
			System.out.println("┌[MEGA MART]┐");
			System.out.println("│[1]로 그 인│");
			System.out.println("│[2]로그아웃│");
			System.out.println("│[3]쇼    핑│");
			System.out.println("│[4]장바구니│");
			System.out.println("│[0]종    료│");
			System.out.println("└───────────┘");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				System.out.print("아이디: ");
				String inputId = scan.next();
				
				System.out.print("비밀번호: ");
				String inputpw = scan.next();
				
				for (int i = 0; i < ids.length; i++) {
					for (int j = 0; j < pws.length; j++) {
						
						if (!ids[i].equals(inputId) || !pws[j].equals(inputpw)) {
							continue;
						}
						
						if (ids[i].equals(inputId) && pws[j].equals(inputpw)) {
							loginOk = 1;
							identifier = i;
						}
					}
				}
				
				if (loginOk == -1) {
					System.out.println();
					System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
					System.out.println();
				}
				else {
					System.out.println();
					System.out.println(ids[identifier] + "님 환영합니다!");
					System.out.println();
				}
				
				System.out.println();
			}
			else if (sel == 2) {
				
				if (loginOk == -1) {
					System.out.println();
					System.out.println("로그인을 먼저 해주세요.");
					System.out.println();
					continue;
				}
				
				if (loginOk == 1) {
					loginOk = -1;
					System.out.println();
					System.out.println("로그아웃 되었습니다.");
					System.out.println();
				}
				
			}
			else if (sel == 3) {
				if (loginOk == -1) {
					System.out.println("로그인 후 이용 가능합니다.");
					continue;
				}
				
				while (true) {
					System.out.println("상품목록");
					for (int i = 0; i < items.length; i++) {
						System.out.println("[" + (i + 1) + "] " + items[i]);
					}
					System.out.println("[" + (items.length + 1) + "] " + "뒤로가기");
					
					System.out.print("상품 번호를 입력하세요: ");
					int itemChoice = scan.nextInt();
					
					if (itemChoice == 4) {
						break;
					}
					jang[count][0] = identifier;
					jang[count][1] = itemChoice;
					count++;
				}
			}
			else if (sel == 4) {
				
				if (loginOk != 1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				else if (loginOk == 1)	System.out.println("아이디: " + ids[identifier]);
				
				int apple = 0;
				int banana = 0;
				int berry = 0;
				
				for (int i = 0; i < count; i++) {
					if (jang[i][0] == identifier) {
						if (jang[i][1] == 1) apple++;
						if (jang[i][1] == 2) banana++;
						if (jang[i][1] == 3) berry++;
					}
				}
				
				System.out.println(items[0] + ": " + apple + "개");
				System.out.println(items[1] + ": " + banana + "개");
				System.out.println(items[2] + ": " + berry + "개");
				
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		scan.close();


	}

}
