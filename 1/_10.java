package _1;
import java.util.Scanner;

public class _10 {
	public static boolean circle(int x1, int y1, int r1,
			int x2, int y2, int r2) {
		double point = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double radius = r1+r2;
		if(point > radius) return false;
		else return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		if(circle(x1,x2,r1,x2,y2,r2))
			System.out.print("�� ���� ���� ��ģ��.");
		else
			System.out.print("��ġ�� �ʴ´�.");
	}
}