package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11721 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String word = br.readLine();

		int cnt = word.length() / 10;

		int start = 0;
		
		for (int i = 0; i < cnt; i++) {

			sb.append(word.substring(start, start + 10)).append("\n");
			start += 10;
		}

		if (word.length() % 10 != 0) {

			sb.append(word.substring((cnt * 10), word.length()));
		}

		System.out.println(sb);

	}
}
