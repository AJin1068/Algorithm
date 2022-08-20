package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1924 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int[] dayArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		/* String dayOfWeek; */

		// 전 달까지 더하기
		for (int i = 0; i < month - 1; i++) {

			if (month == 1)
				break;

			day += dayArr[i];
		}

		switch (day % 7) {

		case 0:
			sb.append("SUN");
			break;
		case 1:
			sb.append("MON");
			break;
		case 2:
			sb.append("TUE");
			break;
		case 3:
			sb.append("WED");
			break;
		case 4:
			sb.append("THU");
			break;
		case 5:
			sb.append("FRI");
			break;
		case 6:
			sb.append("SAT");
			break;
		}

		System.out.println(sb);
	}

}
