package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1524 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int[][] a = new int[10][10];

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;

		int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
		int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

		// 만약 x,y가 1이면 sb에 -1만 append
		// else x,y 주위 8개 배열값중 1이 있으면 count++ 할당 >> sb에 count넣기
		int count = 0;

		if (a[x][y] == 1) {
			System.out.println(-1);
		} else {

			for (int i = 0; i < 8; i++) {

				int nextX = x + dx[i];
				int nextY = y + dy[i];

				if (nextX < 0 || nextY < 0 || nextX >= 9 || nextY >= 9) {
					continue;
				}

				if (a[nextX][nextY] == 1) {
					count++;
				}
			}

			System.out.println(count);
		}

	}

}
