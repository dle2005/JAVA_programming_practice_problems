package _3;
import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	Circle() { }
	Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void max_show(Circle[] c) {
		int max = 0, point = 0;
		for(int i=0; i<c.length; i++) {
			if(c[i].radius > max) {
				max = c[i].radius;
				point = i;
			}
		}
		System.out.println("가장 면적인 큰 원은 ("+c[point].x+","+c[point].y+")"+c[point].radius);
	}
}
public class _6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle max = new Circle();
		Circle c [] = new Circle[3];
		for(int i=0; i<3; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		max.max_show(c);
		scanner.close();
	}
}