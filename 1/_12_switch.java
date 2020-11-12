package _1;
import java.util.Scanner;

public class _12_switch {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("연산>>");
			int x = scanner.nextDouble();
			String a = scanner.next();
			double y = scanner.nextDouble();
			switch(a) {
			case "+" : System.out.print(x+a+y+"의 계산 결과는 "+(x+y));
				break;
			case "-" : System.out.print(x+a+y+"의 계산 결과는 "+(x-y));
				break;
			case "*" : System.out.print(x+a+y+"의 계산 결과는 "+(x*y));
				break;
			case "/" :
				if(y == 0) System.out.print("0으로는 나눌 수 없습니다.");
				else System.out.print(x+a+y+"의 계산 결과는 "+(x/y));
				break;
			}
		}
}
