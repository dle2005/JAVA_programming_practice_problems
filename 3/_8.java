package _3;
import java.util.Scanner;
class Phone {
	String name;
	String tel;
	public Phone() { };
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
}
class PhoneBook {
	Phone[] phoneBook;
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.print("�ο���>>");
		int people_num = scanner.nextInt();
		phoneBook = new Phone[people_num];
		for(int i=0; i<people_num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String phone = scanner.next();
			phoneBook[i] = new Phone(name,phone);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String findName = scanner.next();
			if(findName.equals("�׸�")) break;
			for(int i=0; i<people_num+1; i++) {
				if(i==people_num) { System.out.println(findName+" �� �����ϴ�."); break; }
				if(findName.equals(phoneBook[i].name)) {
					System.out.println(findName+"�� ��ȣ�� "+phoneBook[i].tel);
					break;
				}
			}
		}
	}
}
public class _8 {
	public static void main(String[] args) {
		PhoneBook myPhoneBook = new PhoneBook();
		myPhoneBook.run();
	}
}
