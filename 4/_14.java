package _4;
interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle implements Shape {
	private int r;
	Circle(int r) { this.r = r; }
	public void draw() { System.out.println("반지름이 " + r + "인 원입니다."); }
	public double getArea() { return r*r*PI; }
}
class Oval implements Shape {
	private int sr, lr;
	Oval(int sr, int lr) { this.sr = sr; this.lr = lr; }
	public void draw() { System.out.println(sr + "x" + lr + "에 내접하는 타원입니다."); }
	public double getArea() { return sr*lr*PI; }
}
class Rect implements Shape {
	private int h, w;
	Rect(int h, int w) { this.h = h; this.w = w; }
	public void draw() { System.out.println(h + "x" + w + "크기의 사각형 입니다."); }
	public double getArea() { return h*w*PI; }
}
public class _14 {
	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}