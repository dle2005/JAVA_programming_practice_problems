package _1;
import java.util.Scanner;

public class _6 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("1~99 사이의 정수를 입력하시오>>");
			int num = scanner.nextInt();
			int n10 = num/10;
			int n1 = num%10;
			if(n10 == 0) n10++;
			if(n1 == 0) n1++;
			if(n10%3==0 && n1%3==0)
				System.out.print("박수짝짝");
			else if(n10%3==0 || n1%3==0)
				System.out.print("박수짝");
		}
}