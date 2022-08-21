package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10991 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int gap = N - 1;

		for (int i = 1; i <= N; i++) {

			sb.append(" ".repeat(gap)).append("* ".repeat(i - 1)).append("*\n");
			gap--;
		}

		System.out.println(sb);
	}

}
