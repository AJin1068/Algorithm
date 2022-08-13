package BaegJun;

import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		Queue<Integer> q = new LinkedList<Integer>();

		int n = Integer.parseInt(st.nextToken()); // 7
		int k = Integer.parseInt(st.nextToken());// 3 rear
		int idx = 0; // front

		for (int i = 1; i <= n; i++) { // 1~7���� �ʱ�ȭ
			q.add(i);
		}

		sb.append("<");

		while (!q.isEmpty()) {// true�϶� ������
			if ((idx + 1) % k == 0 ) {// n�ǹ����°�϶�
				if (q.size() == 1) {
					sb.append(q.poll());
				} else {
					sb.append(q.poll()).append(", ");
					idx++;
				}

			} else {
				q.add(q.poll());
				idx++;
			}

		} // end while

		sb.append(">");

		System.out.println(sb);

	}

}
