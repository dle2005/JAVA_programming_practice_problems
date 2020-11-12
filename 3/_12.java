package _3;
import java.util.Scanner;
class ReservationSystem {
	private Scanner scanner = new Scanner(System.in);
	private String[] S, A, B;
	ReservationSystem() {
		S = new String[10];
		A = new String[10];
		B = new String[10];
		for(int i=0; i<10; i++) {
			S[i] = "---";
			A[i] = "---";
			B[i] = "---";
		}
	}
	private void reservation() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int select = scanner.nextInt();
		switch(select) {
			case 1: reservationS(); break;
			case 2: reservationA(); break;
			case 3: reservationB(); break;
			default : System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���"); reservation();
		}
	}
	private void reservationS() {
		System.out.print("S>> ");
		for(int i=0; i<10; i++) System.out.print(S[i]+" ");
		System.out.print("\r�̸�>>");
		String name = scanner.next();
		System.out.print("��ȣ>>");
		int seatNum = scanner.nextInt();
		S[seatNum-1] = name;
	}
	private void reservationA() {
		System.out.print("A>> ");
		for(int i=0; i<10; i++) System.out.print(A[i]+" ");
		System.out.print("\r�̸�>>");
		String name = scanner.next();
		System.out.print("��ȣ>>");
		int seatNum = scanner.nextInt();
		A[seatNum-1] = name;
	}
	private void reservationB() {
		System.out.print("B>> ");
		for(int i=0; i<10; i++) System.out.print(B[i]+" ");
		System.out.print("\r�̸�>>");
		String name = scanner.next();
		System.out.print("��ȣ>>");
		int seatNum = scanner.nextInt();
		B[seatNum-1] = name;
	}
	private void inquiry() {
		System.out.print("S>>");
		for(int i=0; i<10; i++) System.out.print(S[i]+" ");
		System.out.print("\rA>>");
		for(int i=0; i<10; i++) System.out.print(A[i]+" ");
		System.out.print("\rB>>");
		for(int i=0; i<10; i++) System.out.print(B[i]+" ");
		System.out.println("\r<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	private void cancel() {
		System.out.print("�¼� S:1, A:2, B:3>>");
		int select = scanner.nextInt();
		switch(select) {
			case 1: cancelS(); break;
			case 2: cancelA(); break;
			case 3: cancelB(); break;
			default : System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���."); cancel();
		}
	}
	private void cancelS() {
		System.out.print("S>> ");
		for(int i=0; i<10; i++) System.out.print(S[i]+" ");	
		System.out.print("\r�̸�>>");
		String name = scanner.next();
		for(int i=0; i<11; i++) {
			if(i==10) { System.out.println("�߸����Է��Դϴ�. �ٽ� �Է��ϼ���:");  cancelS(); }
			if(name.equals(S[i])) { S[i] = "---"; break; }
		}
	}
	private void cancelA() {
		System.out.print("A>> ");
		for(int i=0; i<10; i++) System.out.print(A[i]+" ");	
		System.out.print("\r�̸�>>");
		String name = scanner.next();
		for(int i=0; i<11; i++) {
			if(i==10) { System.out.println("�߸����Է��Դϴ�. �ٽ� �Է��ϼ���:");  cancelA(); }
			if(name.equals(A[i])) { A[i] = "---"; break; }
		}
	}
	private void cancelB() {
		System.out.print("B>> ");
		for(int i=0; i<10; i++) System.out.print(B[i]+" ");	
		System.out.print("\r�̸�>>");
		String name = scanner.next();
		for(int i=0; i<11; i++) {
			if(i==10) { System.out.println("�߸����Է��Դϴ�. �ٽ� �Է��ϼ���:");  cancelB(); }
			if(name.equals(B[i])) { B[i] = "---"; break; }
		}
	}
	private void finish() {
		scanner.close();
		System.out.println("�ý����� �����մϴ�.");
	}
	public void run() {
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int menuSelect = scanner.nextInt();
			switch(menuSelect) {
				case 1 : reservation(); break;
				case 2 : inquiry(); break;
				case 3 : cancel(); break;
				case 4 : finish(); return;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
}

public class _12 {

	public static void main(String[] args) {
		System.out.println("���ܼ�ƮȦ ����ý����Դϴ�.");
		ReservationSystem myongsung = new ReservationSystem();
		myongsung.run();
	}
}
