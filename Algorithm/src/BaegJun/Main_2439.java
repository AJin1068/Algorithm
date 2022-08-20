package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_2439 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 1; i <= cnt; i++) {

			sb.append(" ".repeat(cnt - i)).append("*".repeat(i)).append("\n");
		}

		System.out.println(sb);

	}
}
