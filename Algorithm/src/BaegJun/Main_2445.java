package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_2445 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<String>();

		for (int i = 1; i <= 2 * N - 1; i++) {

			if (i > N) {

				sb.append(stack.pop()).append("\n");
				continue;
			} else if (i == N) {

				sb.append("*".repeat(N * 2)).append("\n");
				continue;
			}

			sb.append("*".repeat(i)).append(" ".repeat((2 * N) - (2 * i))).append("*".repeat(i)).append("\n");
			stack.push("*".repeat(i) + " ".repeat((2 * N) - (2 * i)) + "*".repeat(i));

		}

		System.out.println(sb);
	}

}
