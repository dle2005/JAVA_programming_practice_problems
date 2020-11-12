package _4;
class TV {
	private int size;
	public TV(int size) {this.size = size; }
	protected int getSize() { return size; }
}
class ColorTV extends TV {
	private int resolution;
	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	public void printProperty() {
		System.out.print(getSize()+"��ġ "+resolution+"�÷�");
	}
}
public class _1 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}
