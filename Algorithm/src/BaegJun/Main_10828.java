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
			int tmp = stack.peek(); // 개체값 반환>tmp에 저장
			stack.pop(); // 개체 아예 제거
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
			return stack.peek(); // 개체값 반환
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

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
