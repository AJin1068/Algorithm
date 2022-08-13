package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2559_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());// 10
		int k = Integer.parseInt(st.nextToken());// 2
		ArrayList<Integer> A = new ArrayList<>();


		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < (N - k + 1); i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += A.get(j);
			}
			max = Math.max(sum, max);
		}

//		for (int i = 0; i < S.size(); i++) {
//			
//			System.out.printf("%d ", S.get(i));
//		}

		System.out.println(max);

	}

}
