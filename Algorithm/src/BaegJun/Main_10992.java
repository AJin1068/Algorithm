package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10992 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int gap = N - 1;

		sb.append(" ".repeat(gap)).append("*\n");

		gap--;

		for (int i = 1; i <= N - 2; i++) {

			sb.append(" ".repeat(gap)).append("*").append(" ".repeat(2 * i - 1)).append("*\n");
			gap--;
		}
		
		if(N!=1) {
			
			sb.append("*".repeat(2 * N - 1));
		}

		System.out.println(sb);
	}

}
