package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_10953 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int cnt = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;

		for (int i = 1; i <= cnt; i++) {

			st = new StringTokenizer(br.readLine(), ",");

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			sb.append(a + b).append("\n");

		}

		System.out.println(sb);
	}
}
