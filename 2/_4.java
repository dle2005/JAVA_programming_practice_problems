package _2;
import java.util.Scanner;
public class _4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		char inputAlp = scanner.next().charAt(0);
		for(int i=0; i<=inputAlp-'a'; i++) {
			for(int j='a'; j<=inputAlp-i; j++)
				System.out.print((char)j);
			System.out.println("");
		}
	}
}
