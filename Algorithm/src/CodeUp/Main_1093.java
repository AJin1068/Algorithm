package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1093 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 1 3 2 2 5 6 7 4 5 9
		// 만약 위 배열의 값과 밑 배열 반복 순서인 i가 같다면 a[i] count++
		// 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0

		int n = Integer.parseInt(st.nextToken());// 10
		int[] a = new int[23];
		int[] b = new int[n];
		int count = 0;

		int k = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {

			b[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == j + 1) { // b배열의 값과 a길이까지의 인덱스 일치여부 비교
					a[j]++;// a배열의 인덱스로 할당해서 count++
				}
			}
		}

		for (int i = 0; i < 23; i++) {
			sb.append(a[i]).append(" ");
		}

		System.out.println(sb);

	}

}
