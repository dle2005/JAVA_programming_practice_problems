package _2;
import java.util.Scanner;
public class _14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int[] score = {95, 88, 76, 62, 55};
		String stop = "�׸�";
		while(true) {
			System.out.print("���� �̸�>>");
			String name = scanner.next();
			if(name.equals(stop)) return;
			for(int i=0; i<course.length; i++) {
				if(name.equals(course[i])) {
					System.out.println(name+"�� ������ "+score[i]);
					break;
				}
				else if(!course[i].equals(name) && i==course.length-1) {
					System.out.println("���°����Դϴ�.");
					break;
				}
			}
		}
	}
}
