package _5;
import java.util.Calendar;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter>키>>");
		String input = scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int set1 = now.get(Calendar.SECOND);
		System.out.println("   현재 초 시간  = " + set1);
		System.out.print("10초 예상 후 <Enter>키>>");
		input = scanner.nextLine();
		Calendar after = Calendar.getInstance();
		int set2 = after.get(Calendar.SECOND);
		System.out.println("   현재 초 시간  = " + set2);
		int result1 = set2 > set1 ? (set2-set1) : (60+set2-set1);
		System.out.print("황기태 시작 <Enter>키>>");
		input = scanner.nextLine();
		Calendar now2 = Calendar.getInstance();
		int set3 = now2.get(Calendar.SECOND);
		System.out.println("   현재 초 시간  = " + set3);
		System.out.print("10초 예상 후 <Enter>키>>");
		input = scanner.nextLine();
		Calendar after2 = Calendar.getInstance();
		int set4 = after2.get(Calendar.SECOND);
		int result2 = set4 > set3 ? (set4-set3) : (60+set4-set3);
		String winner = Math.abs(10-result1) < Math.abs(10-result2) ? "황기태" : "이재문";
		System.out.println("   현재 초 시간  = " + set4);
		System.out.print("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2
				+ ", 승자는 " + winner);
	}
}
