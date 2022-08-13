package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int w = 0, h = 0, n = 0;

		w = sc.nextInt();// 판의 너비
		h = sc.nextInt();// 판의 높이
		n = sc.nextInt();// 막대기 갯수

		int[][] a = new int[n][4]; // 막대기 정보 배열로 입력받기

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = sc.nextInt(); // 2 0 1 1 (1 2)
			} // 3 1 2 3 (3 3)(4 3)
		} // 4 1 2 5 (3 5)(4 5)(5 5)

		int[][] b = new int[w][h]; // 본격 막대기 놓인 판 출력

		for (int i = 0; i < n; i++) {// 막대기 갯수만큼 l d x y 한 줄씩 돌리기

			int l = a[i][0];
			int d = a[i][1];
			int x = a[i][2] - 1;//실제 만지는 변수는 집어넣기 전에 이렇게 -1 하는게 좋음
			int y = a[i][3] - 1;

			for (int j = 0; j < l; j++) {

				if (d == 0) {// 가로일때
					b[x][y++] = 1;// 배열크기 횟수만큼 막대기세팅

				} else if (d == 1) {// 세로일때
					b[x++][y] = 1;
				}
			}
		} // end for
			// Integer.parseInt(Arrays.deep(a[1][2]),1);
			// 다차원 배열에서 특정 값을 추출하는게 어렵다...

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {

				System.out.printf("%d ", b[i][j]);
			}
			System.out.println();
		}

	}

}
