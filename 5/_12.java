package _5;
import java.util.Scanner;

class Person {
	private int a, b, c;
	Person() {
		a = (int)(Math.random()*3)+1;
		b = (int)(Math.random()*3)+1;
		c = (int)(Math.random()*3)+1;
	}
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(a==p.b && b==p.c && c==p.a) return true;
		return false;
	}
	public String toString() {
		return a + " " + b + " " + c + "   ";
	}
}

public class _12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���ӿ� ������ ���� ����>>");
		int num = scanner.nextInt();
		String[] person = new String[num];
		for(int i=0; i<num; i++) {
			System.out.print(i+1 + "��° ���� �̸�>>");
			person[i] = scanner.next();
		}
		String buffer = scanner.nextLine();
		Person[] data = new Person[num];
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print("[" + person[i] + "]:<Enter>");
				String input = scanner.nextLine();
				data[i] = new Person();
				System.out.print("     " + data[i]);
				if(data[i].equals(data[i])) { System.out.print(person[i]+"���� �̰���ϴ�!"); return; }
				else System.out.println("�ƽ�����!");
			}
		}
	}
}
