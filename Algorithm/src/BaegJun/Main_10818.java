package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10818 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int max = -1000000;
		int min = 1000000;
		int num;
		
		for (int i = 0; i < N; i++) {
			
			num = Integer.parseInt(st.nextToken());
			
			if (max < num)
				max = num;
			if (min > num)
				min = num;

			System.out.println(min);
			System.out.println(max);
		}
		
		sb.append(min).append(" ").append(max);
		System.out.println(sb);

	}

}
