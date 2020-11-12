package _4;
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoint extends Point {
	private String color;
	ColorPoint() { super(0,0); color = "BLACK"; }
	ColorPoint(int x, int y) { super(x,y); color = "BLACK"; }
	void setXY(int x, int y) { move(x,y); }
	void setColor(String color) { this.color = color; }
	public String toString() { return color+"���� ("+getX()+","+getY()+")��  ��"; }
}
public class _6 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
}