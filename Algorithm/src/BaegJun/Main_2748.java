package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2748 {

	static long[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		arr = new long[N + 1];

		for (int i = 0; i < N+1; i++) {
			arr[i] = -1; //0과 구분해주기 위해 -1로 전부 초기화해주고, 값이 안들어간 N+1(맨끝부분)일때 fib메소드 멈추기 위함
		}

		arr[0] = 0;
		arr[1] = 1;

		System.out.println(fib(N));

	}

	public static long fib(int N) {

		if (arr[N] == -1) { //메모이제이션 사용(저장된게 없다면 계산수행)
			
			arr[N] = fib(N - 1) + fib(N - 2);
		}

		return arr[N];
	}
}
