package CodeUp;

import java.util.Scanner;

public class Main_1096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 흰 돌 변수 선언, 19x19 바둑판 2차배열 선언
		// int n에 흰 돌 지정 위치 스캐너로 받고
		// for문 돌려가며 19x19크기로 n을 공백분리하고 래퍼로 감싸서 넣기
		// 다른 for문으로 0,1 바둑판 2차배열 출력
		Scanner sc = new Scanner(System.in);
		//StringBuffer sb = new StringBuffer(40);

		int n = sc.nextInt();
		int[][] a = new int[19][19];
		//나중에는 방향마다 탐색할 때가 있음>옆이 비어있으면 에러떨어지기때문에 배열크기를 
		//넉넉하게 선언하는게 좋음
		int x = 0;
		int y = 0;

		for (int i=0; i<n; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;

			for (int j=0; j<n; j++) {
				a[x][y] = 1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}

	}

}
