package _2;
import java.util.Scanner;
public class _4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char inputAlp = scanner.next().charAt(0);
		for(int i=0; i<=inputAlp-'a'; i++) {
			for(int j='a'; j<=inputAlp-i; j++)
				System.out.print((char)j);
			System.out.println("");
		}
	}
}
