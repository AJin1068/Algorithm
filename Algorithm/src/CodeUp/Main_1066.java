package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1066 {

	public static void main(String[] args) throws Exception {
		// even : ¦ odd : Ȧ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		String res;
		int a = 0;

		for (int i = 1; i <= 3; i++) {

			a = Integer.parseInt(st.nextToken());

			if (a % 2 == 0) {
				res = "even";
			} else {
				res = "odd";
			}

			sb.append(res).append("\n");
		} // end for

		System.out.println(sb);

	}

}
