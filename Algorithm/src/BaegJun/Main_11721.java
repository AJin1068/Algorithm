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
			// 0~9, 10~19

			sb.append(word.substring(start, start + 10)).append("\n");
			// substring두번째 인덱스 전까지만 자름. 원하는 길이 +1 해야함
			start += 10;
		}

		if (word.length() % 10 != 0) {

			sb.append(word.substring((cnt * 10), word.length()));
		}

		System.out.println(sb);

	}
}
