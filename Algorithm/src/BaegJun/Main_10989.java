package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_10989 {

	public static void main(String[] args) throws Exception {
		// 카운팅정렬쓰기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
//		Scanner sc = new Scanner(System.in);

		//int n = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {

			arr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arr);

		for (int next : arr) {

			sb.append(next).append("\n");
		}

		System.out.println(sb);
	}

}
