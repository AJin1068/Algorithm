package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_17608 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		List<Integer> array = new ArrayList<Integer>();

		int N = Integer.parseInt(st.nextToken());// 6

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());
			int lng = Integer.parseInt(st.nextToken()); // 697646

			array.add(lng);
		}

		int max = 0;
		int count = 0;

		// 0 1 2 7 4 5
		for (int i = (N - 1); i >= 0; i--) { // 맨 끝 값과 그 앞에 값들을 5번 비교

			if (max < array.get(i)) { // 5번째(N) <
				max = array.get(i);
				count++;
			}
		}

		System.out.println(count);

	}
}
