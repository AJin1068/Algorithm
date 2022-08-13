package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2559 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		List<Integer> a = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());// 10
		int k = Integer.parseInt(st.nextToken());// 2

		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}

		int now = 0;
		int max = 0;
		int sum = 0;
		
		
		for (int i = 0; i < (N - k + 1); i++) { // k크기의 덩어리가 N까지 몇 번?
			sum = 0;
			for (int j = 1; j <= k; j++) {// k덩어리 내에서 합산
				sum = sum + a.get(now++) ;
			} // end 2for
			if (sum > max) {
				max = sum;
			} // end if
			now = now - (k - 1);
		} // end 1for

		System.out.println(max);

	}

}
