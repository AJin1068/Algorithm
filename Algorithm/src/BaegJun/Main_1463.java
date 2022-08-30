package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
		int cnt = 0;

		do {

//			System.out.println("--------------");
			if (X % 3 == 0) {
				X = X / 3;
				cnt++;
//				System.out.println("A");
//				System.out.println(X);
				continue;

			} else if (X % 2 == 0 && X % 3 != 0) {
				X = X / 2;
				cnt++;
//				System.out.println("B");
//				System.out.println(X);
				continue;

			} else if(X % 2 != 0 && X % 3 != 0){
				X = X - 1;
				cnt++;
//				System.out.println("C");
//				System.out.println(X);
				continue;
			}

		} while (X != 1);

		System.out.println(cnt);

	}
}
