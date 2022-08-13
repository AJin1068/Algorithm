package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828 {

	public static Stack<Integer> stack = new Stack<>();

	int size = 0;

	public static int pop() {
		if (stack.isEmpty()) {
			return -1;
		} else {
			int tmp = stack.peek(); // ��ü�� ��ȯ>tmp�� ����
			stack.pop(); // ��ü �ƿ� ����
			return tmp;
		}
	}

	public static int size() {
		return stack.size();
	}

	public static int empty() {
		if (stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int top() {
		if (stack.isEmpty()) {
			return -1;
		} else {
			return stack.peek(); // ��ü�� ��ȯ
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
//		push X: ���� X�� ���ÿ� �ִ� �����̴�.
//		pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//		size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//		empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//		top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {

			case "push":
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;

			case "empty":
				sb.append(empty()).append('\n');
				break;

			case "top":
				sb.append(top()).append('\n');
				break;
			}// end switch

		} // end for

		System.out.println(sb);

	}
}
