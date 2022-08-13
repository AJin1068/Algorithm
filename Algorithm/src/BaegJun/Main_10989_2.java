package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_10989_2 {

	public static void main(String[] args) throws Exception {
		// 카운팅정렬쓰기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

//		Scanner sc = new Scanner(System.in);

		// int n = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {

			arr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < 10001; i++) {
			if (arr[i] != 0) {
				for (int j = 0; j < arr[i]; j++) {
					sb.append(i).append("\n");
				}
			}
		}

		System.out.println(sb);
	}

}
