package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2455 {

	public static void main(String[] args) throws Exception {
		// 4°³ÀÇ Á¤Âø¿ª

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int[][] a = new int[4][2];

		for (int i = 0; i < 4; i++) {

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {

				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[] b = new int[4];
		b[0] = a[0][1];

		for (int i = 1; i <= 3; i++) {

			b[i] = b[i - 1] - a[i][0] + a[i][1];
		}

		Arrays.sort(b);
		System.out.println(b[3]);
	}

}
