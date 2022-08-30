package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(st.nextToken());
		int line = Integer.parseInt(st.nextToken());

		int[] sumList = new int[num + 1];

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= num; i++) {

			sumList[i] = sumList[i - 1] + Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= line; i++) {

			st = new StringTokenizer(br.readLine());
			
			sb.append(-(sumList[Integer.parseInt(st.nextToken()) - 1] - sumList[Integer.parseInt(st.nextToken())])).append("\n");
		}
		
		System.out.println(sb);

	}

}
