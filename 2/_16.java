package _2;
import java.util.Scanner;
public class _16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		while(true) {
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			String input = scanner.next();
			if(input.equals("�׸�")) return;
			int n = (int)(Math.random()*3);
			System.out.print("��ǻ��  = "+str[n]+", ");
			if(input.equals(str[n]))
				System.out.println("�����ϴ�.");
			else {
				if(n==0) {
					if(input.equals(str[2]))
						System.out.println("�����ϴ�.");
					else
						System.out.println("����ڰ� �̰���ϴ�.");
				}
				else if(n==1) {
					if(input.contentEquals(str[0]))
						System.out.println("�����ϴ�.");
					else
						System.out.println("����ڰ� �̰���ϴ�.");
				}
				else {
					if(input.contentEquals(str[1]))
						System.out.println("�����ϴ�.");
					else
						System.out.println("����ڰ� �̰���ϴ�.");
				}
					
			}
			
		}
	}
}
