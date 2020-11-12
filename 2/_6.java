package _2;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int inputMoney = scanner.nextInt();
		for(int i : unit) {
			int temp = inputMoney/i;
			if(temp==0) continue;
			System.out.println(i+"원 짜리 : "+inputMoney/i+"개");
			inputMoney -= temp*i;
		}
	}
}
