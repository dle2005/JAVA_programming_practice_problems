package _2;
import java.util.Scanner;
public class _14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		String stop = "그만";
		while(true) {
			System.out.print("과목 이름>>");
			String name = scanner.next();
			if(name.equals(stop)) return;
			for(int i=0; i<course.length; i++) {
				if(name.equals(course[i])) {
					System.out.println(name+"의 점수는 "+score[i]);
					break;
				}
				else if(!course[i].equals(name) && i==course.length-1) {
					System.out.println("없는과목입니다.");
					break;
				}
			}
		}
	}
}
