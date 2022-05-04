import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		String user;

		System.out.println("*****컴퓨터와 가위 바위 보 게임을 합니다.*****");
			
		while (true) {	
			System.out.print("가위 바위 보! (종료:'그만'입력) >> ");
			
			user = scanner.next(); // 사용자 입력값 저장
			int computer = (int)(Math.random() * 3); // n은 0, 1, 2 중에서 랜덤하게 결정
			
			if (user.equals("그만")){
				System.out.print("게임을 종료합니다...");
				break;
			}
			
			System.out.println("사용자: " + user + ", 컴퓨터: " + str[computer]);
			
			if (user.equals("가위")) {				
				if (str[computer].equals("가위")) {
					System.out.println("비겼습니다.");
				}
				else if(str[computer].equals("바위")) {
					System.out.println("사용자가 졌습니다.");
				}
				else {
					System.out.println("사용자가 이겼습니다.");
				}
			}
			
			else if (user.equals("바위")) {		
				if (str[computer].equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else if(str[computer].equals("바위")) {
					System.out.println("비겼습니다.");
				}
				else {
					System.out.println("사용자가 졌습니다.");
				}
			}
			
			else if (user.equals("보")) {				
				if (str[computer].equals("가위")) {
					System.out.println("사용자가 졌습니다.");
				}
				else if(str[computer].equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else {
					System.out.println("비겼습니다.");
				}
			}
			
			else {
				System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			}
			System.out.println();
		}
	scanner.close();
	}
}
