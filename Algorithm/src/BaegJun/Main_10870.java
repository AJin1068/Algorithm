package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10870 {

	static long[] arr;

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		arr = new long[N + 1];

		for (int i = 0; i < N + 1; i++) {

			arr[i] = -1;

		}

		arr[0] = 0;

		if (N > 0) {
			arr[1] = 1;
		}

		System.out.println(fib(N));
	}

	public static long fib(int N) {

		if (arr[N] != -1) {

			return arr[N];// return으로 바로 반환하는거 중요함!!
			
		} else if (arr[N] == -1) {

			arr[N] = fib(N - 1) + fib(N - 2);
		}

		return arr[N];

	}

}
