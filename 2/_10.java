package _2;

public class _10 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr[i].length; j++)
				arr[i][j] = 0;
		int k=0;
		while(k<10) {
			int rows = (int)(Math.random()*4);
			int cols = (int)(Math.random()*4);
			if(arr[rows][cols]==0) {
				arr[rows][cols] = (int)(Math.random()*10)+1;
				k++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++)
				System.out.printf("%-2d  ", arr[i][j]);
			System.out.println();
		}
	}
}
