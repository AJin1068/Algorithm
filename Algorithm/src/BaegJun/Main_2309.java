package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_2309 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 9명 더해서 2명씩 계속 빼보기
		List<Integer> a = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < 9; i++) {

			a.add(Integer.parseInt(br.readLine()));
			sum += a.get(i);
		}

		int x = 0;
		int y = 0;

		OUT: for (x = 0; x < 9; x++) {
			for (y = 0; y < 9; y++) {

				if (x != y && (sum - (a.get(x) + a.get(y))) == 100) {
					a.remove(x);
					a.remove(y - 1);
					break OUT;
				}
			}
		}

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++) {

			sb.append(a.get(i)).append("\n");
		}

		System.out.println(sb);

	}
}
