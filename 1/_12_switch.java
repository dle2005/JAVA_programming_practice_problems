package _1;
import java.util.Scanner;

public class _12_switch {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("����>>");
			int x = scanner.nextDouble();
			String a = scanner.next();
			double y = scanner.nextDouble();
			switch(a) {
			case "+" : System.out.print(x+a+y+"�� ��� ����� "+(x+y));
				break;
			case "-" : System.out.print(x+a+y+"�� ��� ����� "+(x-y));
				break;
			case "*" : System.out.print(x+a+y+"�� ��� ����� "+(x*y));
				break;
			case "/" :
				if(y == 0) System.out.print("0���δ� ���� �� �����ϴ�.");
				else System.out.print(x+a+y+"�� ��� ����� "+(x/y));
				break;
			}
		}
}
