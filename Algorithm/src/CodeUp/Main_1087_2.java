package CodeUp;

import java.util.Scanner;

public class Main_1087_2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 57
		int b = 1;
		int b2 = 2;

		while (true) {
			if (a > b && a < b + b2) {// ¿©±â¼­
				break;
			} else {

				b += b2;
				b2++;
			}
		}

		System.out.println(b + b2);

	}

}
