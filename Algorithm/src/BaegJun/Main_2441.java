package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_2441 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int cnt = Integer.parseInt(br.readLine());

		for (int i = cnt; i >= 1; i--) {

			sb.append(" ".repeat(cnt-i)).append("*".repeat(i)).append("\n");
		}

		System.out.println(sb);

	}
}
