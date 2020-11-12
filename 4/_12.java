package _4;
import java.util.*;
abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }
	public Shape getNext() { return next; }
	public abstract void draw();
}
class Line extends Shape {	public void draw() { System.out.println("Line"); } }
class Rect extends Shape {	public void draw() { System.out.println("Rect"); } }
class Circle extends Shape {	public void draw() { System.out.println("Circle"); } }

public class _12 {
	static Shape first = null;
	static Shape last = null;
	
	static void insert() {
		Scanner scanner = new Scanner(System.in);
		Shape myShape = null;
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int menu = scanner.nextInt();
		switch(menu) {
			case 1: myShape = new Line(); break;
			case 2: myShape = new Rect(); break;
			case 3: myShape = new Circle(); break;
		}
		if(first==null) first = last = myShape;
		else { last.setNext(myShape); last = myShape; }
	}
	
	static boolean delete() {
		Scanner scanner = new Scanner(System.in);
		Shape temp = first;
		Shape temp2 = first;
		System.out.print("삭제할 도형의 위치>>");
		if(first==null) return false;
		int deleteI = scanner.nextInt()-1;
		for(int i=0; i<deleteI; i++) {
			temp = temp2;
			temp2 = temp.getNext();
			if(temp2==null) return false;
		}
		if(deleteI == 0) { first = first.getNext(); return true; }
		temp.setNext(temp2.getNext());
		temp2.setNext(null);
		return true;
	}
	
	static void show() {
		Shape myShape = first;
		while(myShape != null) {
			myShape.draw();
			myShape = myShape.getNext();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int menu = scanner.nextInt();
			switch(menu) {
				case 1: insert(); break;
				case 2: boolean canDelete = delete();
						if(canDelete == true) System.out.println("삭제하였습니다.");
						else System.out.println("삭제할 수 없습니다."); break;
				case 3: show(); break;
				case 4: return;
			}
		}
	}
}