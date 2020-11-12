package _1;
import java.util.Scanner;

public class _8 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, 
			int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x1, y1을 입력하시오: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("x2, y2을 입력하시오: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		if(inRect(x1,y1,100,100,200,200) || inRect(x2,y2,100,100,200,200))
			System.out.print("충돌 꽝~!");
		else
			System.out.print("충돌하지 않습니다.");
	}
}