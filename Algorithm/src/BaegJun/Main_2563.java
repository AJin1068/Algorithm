package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2563 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// readline : 한 줄만 받는다 까먹지말기

		int[][] o = new int[101][101];

		int n = Integer.parseInt(st.nextToken());
		// int [][] r = new int [2][n];

		int w = 0; // width
		int h = 0;// height

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			for (int j = 0; j < 10; j++) {

				for (int k = 0; k < 10; k++) {
					o[w][h + k] = 1;

				}
				w++;
			}
		}

		int count = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (o[i][j] == 1) {
					count++;
				}
			}
		}

		System.out.println(count);

	}
}