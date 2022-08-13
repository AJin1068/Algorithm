package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11931 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());// 입력값이백만개 or 값이백만

		char[] arr = new char[1000001];

		for (int i = 0; i < n; i++) {

			arr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 999999; i >= 0; i--) {
			if (arr[i] != 48) {
				for (int j = 0; j < (int) arr[i]; j++) {
					sb.append(i).append("\n");
				}
			}
		}

		System.out.println(sb.toString());
	}

}
