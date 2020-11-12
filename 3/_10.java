package _3;
import java.util.Scanner;
class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i]))
				return (kor[i]+"�� "+eng[i]);
		}
		return word+"�� ���� ������ �����ϴ�.";
	}
}
public class _10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = scanner.next();
			if(word.equals("�׸�")) break;
			System.out.println(Dictionary.kor2Eng(word));
		}
		scanner.close();
	}
}
