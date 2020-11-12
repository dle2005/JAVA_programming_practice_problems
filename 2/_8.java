package _2;
import java.util.Scanner;
public class _8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int inputNum = scanner.nextInt();
		int cols = (inputNum/10)+1;
		int rows = inputNum%10;
		int[][] arr = new int[cols][];
		int[] temp = new int[inputNum];
		for(int i=0; i<cols; i++)
			arr[i] = new int[10];
		arr[cols-1] = new int[rows];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
				temp[i+j]=arr[i][j];
				for(int k=0; k<i+j; k++) {
					if(temp[k]==arr[i][j]) j--;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
