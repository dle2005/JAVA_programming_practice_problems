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
class IPTV extends ColorTV {
	private String address;
	public IPTV(String address, int size, int resolution) {
		super(size,resolution);
		this.address = address;
	}
	public void printProperty() {
		System.out.print("���� IPTV�� "+address+" �ּ��� ");
		super.printProperty();
	}
}
public class _2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}