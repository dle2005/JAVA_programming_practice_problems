package _5;
import java.util.Calendar;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <Enter>Ű>>");
		String input = scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int set1 = now.get(Calendar.SECOND);
		System.out.println("   ���� �� �ð�  = " + set1);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		input = scanner.nextLine();
		Calendar after = Calendar.getInstance();
		int set2 = after.get(Calendar.SECOND);
		System.out.println("   ���� �� �ð�  = " + set2);
		int result1 = set2 > set1 ? (set2-set1) : (60+set2-set1);
		System.out.print("Ȳ���� ���� <Enter>Ű>>");
		input = scanner.nextLine();
		Calendar now2 = Calendar.getInstance();
		int set3 = now2.get(Calendar.SECOND);
		System.out.println("   ���� �� �ð�  = " + set3);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		input = scanner.nextLine();
		Calendar after2 = Calendar.getInstance();
		int set4 = after2.get(Calendar.SECOND);
		int result2 = set4 > set3 ? (set4-set3) : (60+set4-set3);
		String winner = Math.abs(10-result1) < Math.abs(10-result2) ? "Ȳ����" : "���繮";
		System.out.println("   ���� �� �ð�  = " + set4);
		System.out.print("Ȳ������ ��� " + result1 + ", ���繮�� ��� " + result2
				+ ", ���ڴ� " + winner);
	}
}
