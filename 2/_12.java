package _2;

public class _12 {
	public static void main (String[] args) {
		if(args.length == 0) {
			System.out.println("명령행 인자가 업습니다.");
			return;
		}
		int sum=0;
		for(int i=0; i<args.length; i++) {
			try {
			sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {}
		}
		System.out.println(sum); // 평균 출력
	}
}