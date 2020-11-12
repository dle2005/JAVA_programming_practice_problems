package _5;
class Circle {
	private int x, y, radius;
	Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public String toString() {
		return "Circle(" + x + "," + y + ")������ " + radius;
	}
	public boolean equals(Object o) {
		Circle co = (Circle)o;
		if(this.x == co.x && this.y == co.y) return true;
		return false;
	}
}

public class _2 {
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b)) System.out.println("���� ��");
		else System.out.println("���� �ٸ� ��");
	}
}
