package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1087 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine()); // 57
		int i = 0, s = 0; // b:증가 b2:적립 b3:최종(b나 b2가 둘 중 하나만 1이여야)
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
