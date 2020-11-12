package _5;
import java.util.Scanner;

public class _8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String sub = input.substring(1);
		String first = input.substring(0,1);
		for(int i=0; i<input.length(); i++) {
			sub = sub.concat(first);			
			System.out.println(sub);
			first = sub.substring(0,1);
			sub = sub.substring(1);
		}
	}
}
