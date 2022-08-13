package CodeUp;

import java.util.Scanner;

public class Main_1097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n, i, j, x = 0, y = 0;
		int[][] a = new int[19][19];

		for (i = 0; i < 19; i++) { // 한 줄씩 바둑판 상황 입력 받기
			String[][] b = new String[20][20];
			for (j = 0; j < 19; j++) {
				b[i][j] = sc.next();
			}
		}
		n = sc.nextInt(); // 좌표 개수 입력받기

		for (i = 1; i <= n; i++) // 좌표의 개수만큼
		{
			x = sc.nextInt() - 1; // 9 ,11
			y = sc.nextInt() - 1;

			for (j = 0; j < 19; j++) {
				if (a[x][j] == 0) {
					a[x][j] = 1;
				}else {
					a[x][j] = 0;
				}if (a[j][y] == 0) {
					a[j][y] = 1;
				}else {
					a[j][y] = 0;
				}	

			}
		}
//		 for(j=0; j<19; j++) //세로 줄 흑<->백 바꾸기
//		  {
//		    if(a[j][y]==0) a[j][y]=1;
//		    else a[j][y] = 0;
//		  }

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
//	 a[x][j] = (j==x)? 1 : 0; //행이x일때 1/ 아니면 0
//	  a[j][y] = (j==y)? 1 : 0; //열이y일때 1/ 아니면 0
}
