package _2;

public class _12 {
	public static void main (String[] args) {
		if(args.length == 0) {
			System.out.println("����� ���ڰ� �����ϴ�.");
			return;
		}
		int sum=0;
		for(int i=0; i<args.length; i++) {
			try {
			sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {}
		}
		System.out.println(sum); // ��� ���
	}
}