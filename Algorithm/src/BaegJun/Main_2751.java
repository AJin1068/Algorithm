package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(); // 5 5 4 3 2 1
		List<Integer> arr = new ArrayList<>();

		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());
			arr.add(Integer.parseInt(st.nextToken()));

		}

		Collections.sort(arr);

		for (int i = 0; i < N; i++) {

			sb.append(arr.get(i)).append("\n");
		}

		System.out.println(sb);

	}

}
