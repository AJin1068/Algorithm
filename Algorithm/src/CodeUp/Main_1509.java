package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1509 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int[][] a = new int[13][12];

		for (int i = 0; i < 11; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 10; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		int r = 0;// row
		int c = 0;// column

		// 1 2 5 6 8 10
		for (int i = 0; i < 10; i++) {

			if (a[10][i] != 1) {
				c++;
				continue;
			}
			r = 10;

			for (int j = 0; j < 10; j++) {
				r--;
				if (a[r][c] > 0) {
					sb.append(c + 1).append(" ").append("crash").append("\n");
					break;
				} else if (a[r][c] < 0) {
					sb.append(c + 1).append(" ").append("fall").append("\n");
					break;
				}
			}
			if (r == 0) {
				sb.append(c + 1).append(" ").append("safe").append("\n");
			}
			c++;

		} // end for

		System.out.println(sb);

	}

}
