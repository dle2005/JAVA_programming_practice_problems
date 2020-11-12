package _4;
interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}
class Circle implements Shape {
	private int r;
	Circle(int r) { this.r = r; }
	public void draw() { System.out.println("�������� " + r + "�� ���Դϴ�."); }
	public double getArea() { return r*r*PI; }
}
public class _13 {
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
}