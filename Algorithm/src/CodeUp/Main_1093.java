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
		// ���� �� �迭�� ���� �� �迭 �ݺ� ������ i�� ���ٸ� a[i] count++
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
				if (b[i] == j + 1) { // b�迭�� ���� a���̱����� �ε��� ��ġ���� ��
					a[j]++;// a�迭�� �ε����� �Ҵ��ؼ� count++
				}
			}
		}

		for (int i = 0; i < 23; i++) {
			sb.append(a[i]).append(" ");
		}

		System.out.println(sb);

	}

}
