package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11022 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int cnt = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;
		int num = 1;

		for (int i = 1; i <= cnt; i++) {

			st = new StringTokenizer(br.readLine());

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			sb.append("Case #").append(num).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b)
					.append("\n");

			num++;

		}

		System.out.println(sb);
	}
}
