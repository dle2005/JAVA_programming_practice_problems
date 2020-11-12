package _2;
import java.util.Scanner;
public class _16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		while(true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			String input = scanner.next();
			if(input.equals("그만")) return;
			int n = (int)(Math.random()*3);
			System.out.print("컴퓨터  = "+str[n]+", ");
			if(input.equals(str[n]))
				System.out.println("비겼습니다.");
			else {
				if(n==0) {
					if(input.equals(str[2]))
						System.out.println("졌습니다.");
					else
						System.out.println("사용자가 이겼습니다.");
				}
				else if(n==1) {
					if(input.contentEquals(str[0]))
						System.out.println("졌습니다.");
					else
						System.out.println("사용자가 이겼습니다.");
				}
				else {
					if(input.contentEquals(str[1]))
						System.out.println("졌습니다.");
					else
						System.out.println("사용자가 이겼습니다.");
				}
					
			}
			
		}
	}
}
