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
			arr[i] = -1; //0�� �������ֱ� ���� -1�� ���� �ʱ�ȭ���ְ�, ���� �ȵ� N+1(�ǳ��κ�)�϶� fib�޼ҵ� ���߱� ����
		}

		arr[0] = 0;
		arr[1] = 1;

		System.out.println(fib(N));

	}

	public static long fib(int N) {

		if (arr[N] == -1) { //�޸������̼� ���(����Ȱ� ���ٸ� ������)
			
			arr[N] = fib(N - 1) + fib(N - 2);
		}

		return arr[N];
	}
}
