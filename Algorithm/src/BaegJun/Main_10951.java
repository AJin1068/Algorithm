package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10951 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;

		while ((str = br.readLine()) != null) {

			//st�� br�� �־������ �������� ���� �ϳ� �� �߰��Ǳ⶧����
			//�ӽú��� str(br.readLine���� ������)�� ��ü
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a + b).append("\n");

		}
		System.out.print(sb);

	}
}
