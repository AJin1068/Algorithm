package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_15688 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());// ¹é¸¸

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = Integer.parseInt(br.readLine());

		}

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {

			sb.append(arr[i]).append("\n");

		}
		System.out.println(sb);

	}

}
