package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1087 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine()); // 57
		int i = 0, s = 0; // b:���� b2:���� b3:����(b�� b2�� �� �� �ϳ��� 1�̿���)
		// a=1 b3=1
		// a=55

		while (true) {

			i++;
			s += i;
			if (s >= n) {
				break;
			}

		}

		System.out.println(s);

	}

}
