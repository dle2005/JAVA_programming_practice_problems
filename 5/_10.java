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
public class _10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1��° ���� �̸�>>");
		String first = scanner.nextLine();
		System.out.print("2��° ���� �̸�>>");
		String second = scanner.nextLine();
		while(true) {
			System.out.print("[" + first + "]:<Enter>");
			String input = scanner.nextLine();
			Person firstP = new Person();
			System.out.print("      " + firstP);
			if(firstP.equals(firstP)) { System.out.print(first+"���� �̰���ϴ�!"); break; }
			else System.out.println("�ƽ�����!");
			System.out.print("[" + second + "]:<Enter>");
			input = scanner.nextLine();
			Person secondP = new Person();
			System.out.print("      " + secondP);
			if(secondP.equals(secondP)) { System.out.print(second+"���� �̰���ϴ�!"); break; }
			else System.out.println("�ƽ�����!");
		}
	}
}
