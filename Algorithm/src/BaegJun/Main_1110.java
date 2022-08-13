package BaegJun;

import java.util.Scanner;

public class Main_1110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// n / (one*10 + (ten*10 + one)%10))

		int n = sc.nextInt(); // 입력받은 수
		int nn = n; // 마지막에 n을 비교하려면 n이 손상되면 안됨

		int count = 0;

		while (true) {

			// 여기에 n을 넣어야 하기 때문에 변해야하는 nn으로 따로 줬음ㄴㄴㅇ
			// nn를 반복문안에 못넣어서 한참 헤맸음....(치성님도움)
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);

			count++;
			if (n == nn) {
				break;
			}
		}

		System.out.println(count);

	}
}