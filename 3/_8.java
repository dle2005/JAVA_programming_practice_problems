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
		System.out.print("인원수>>");
		int people_num = scanner.nextInt();
		phoneBook = new Phone[people_num];
		for(int i=0; i<people_num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String phone = scanner.next();
			phoneBook[i] = new Phone(name,phone);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String findName = scanner.next();
			if(findName.equals("그만")) break;
			for(int i=0; i<people_num+1; i++) {
				if(i==people_num) { System.out.println(findName+" 이 없습니다."); break; }
				if(findName.equals(phoneBook[i].name)) {
					System.out.println(findName+"의 번호는 "+phoneBook[i].tel);
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
