package BaegJun;

import java.util.Scanner;

public class Main_2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String result = "";

		int s = 0;

		for (int i = 0; i <= 2; i++) {
			s = 0; // 여기서 초기화 안하면 두번째 for문의 s값을 그대로 가져옴
			for (int j = 0; j <= 3; j++) {

				s = s + sc.nextInt(); // 한줄씩 받기

			}
			switch (s) {
			case 1:
				result = "C";
				break;
			case 2:
				result = "B";
				break;
			case 3:
				result = "A";
				break;
			case 4:
				result = "E";
				break;
			case 0:
				result = "D";
				break;

			}

			sb.append(result).append("\n");

		} // end for

		System.out.println(sb);

	}

}
