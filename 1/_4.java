package _1;
import java.util.Scanner;

public class _4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int middle = 0;
		if(a==b&&b==c)
			System.out.print("중간값은 "+a);
		else {
			if((b<a&&a<c) || (c<a&&a<b)) middle = a;
			if((a<b&&b<c) || (c<b&&b<a)) middle = b;
			if((a<c&&c<b) || (c<a&&b<c)) middle = c;
			System.out.print("중간값은 "+middle);
		}
	}
}