package _1;
import java.util.Scanner;

public class _12_if_else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>>");
		double x = scanner.nextDouble();
		String add = scanner.next();
		double y = scanner.nextDouble();
		if(add.equals("+"))
			System.out.print(x+add+y+"�� ��� ����� "+(x+y));
		else if(add.equals("-"))
			System.out.print(x+add+y+"�� ��� ����� "+(x-y));
		else if(add.equals("*"))
			System.out.print(x+add+y+"�� ��� ����� "+(x*y));
		else if(add.equals("/")) {
			if(y == 0)
				System.out.print("0���δ� ���� �� �����ϴ�.");
			else
				System.out.print(x+add+y+"�� ��� ����� "+(x/y));
		}
	}
}
