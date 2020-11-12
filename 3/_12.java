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
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int select = scanner.nextInt();
		switch(select) {
			case 1: reservationS(); break;
			case 2: reservationA(); break;
			case 3: reservationB(); break;
			default : System.out.println("잘못된 입력입니다. 다시 입력해주세요"); reservation();
		}
	}
	private void reservationS() {
		System.out.print("S>> ");
		for(int i=0; i<10; i++) System.out.print(S[i]+" ");
		System.out.print("\r이름>>");
		String name = scanner.next();
		System.out.print("번호>>");
		int seatNum = scanner.nextInt();
		S[seatNum-1] = name;
	}
	private void reservationA() {
		System.out.print("A>> ");
		for(int i=0; i<10; i++) System.out.print(A[i]+" ");
		System.out.print("\r이름>>");
		String name = scanner.next();
		System.out.print("번호>>");
		int seatNum = scanner.nextInt();
		A[seatNum-1] = name;
	}
	private void reservationB() {
		System.out.print("B>> ");
		for(int i=0; i<10; i++) System.out.print(B[i]+" ");
		System.out.print("\r이름>>");
		String name = scanner.next();
		System.out.print("번호>>");
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
		System.out.println("\r<<<조회를 완료하였습니다.>>>");
	}
	private void cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int select = scanner.nextInt();
		switch(select) {
			case 1: cancelS(); break;
			case 2: cancelA(); break;
			case 3: cancelB(); break;
			default : System.out.println("잘못된 입력입니다. 다시 입력하세요."); cancel();
		}
	}
	private void cancelS() {
		System.out.print("S>> ");
		for(int i=0; i<10; i++) System.out.print(S[i]+" ");	
		System.out.print("\r이름>>");
		String name = scanner.next();
		for(int i=0; i<11; i++) {
			if(i==10) { System.out.println("잘못된입력입니다. 다시 입력하세요:");  cancelS(); }
			if(name.equals(S[i])) { S[i] = "---"; break; }
		}
	}
	private void cancelA() {
		System.out.print("A>> ");
		for(int i=0; i<10; i++) System.out.print(A[i]+" ");	
		System.out.print("\r이름>>");
		String name = scanner.next();
		for(int i=0; i<11; i++) {
			if(i==10) { System.out.println("잘못된입력입니다. 다시 입력하세요:");  cancelA(); }
			if(name.equals(A[i])) { A[i] = "---"; break; }
		}
	}
	private void cancelB() {
		System.out.print("B>> ");
		for(int i=0; i<10; i++) System.out.print(B[i]+" ");	
		System.out.print("\r이름>>");
		String name = scanner.next();
		for(int i=0; i<11; i++) {
			if(i==10) { System.out.println("잘못된입력입니다. 다시 입력하세요:");  cancelB(); }
			if(name.equals(B[i])) { B[i] = "---"; break; }
		}
	}
	private void finish() {
		scanner.close();
		System.out.println("시스템을 종료합니다.");
	}
	public void run() {
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int menuSelect = scanner.nextInt();
			switch(menuSelect) {
				case 1 : reservation(); break;
				case 2 : inquiry(); break;
				case 3 : cancel(); break;
				case 4 : finish(); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}

public class _12 {

	public static void main(String[] args) {
		System.out.println("명성콘서트홀 예약시스템입니다.");
		ReservationSystem myongsung = new ReservationSystem();
		myongsung.run();
	}
}
