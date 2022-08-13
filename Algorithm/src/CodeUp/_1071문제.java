package CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class _1071문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();// 현재 시간
		// int는 공백 띄어서 하나씩 받아옴
		// time, now_score에 엔터 안쳐도 따로 들어감
		int playtime = 90 - time;

		int now_score = sc.nextInt();// 우리팀의 득점
		int si_goal = 0;

		// (90 - 현재시간) 5분에 한 번씩 si_goal(++)이 증가
		// last_score : now_score + si_goal
		for (int i = 0; i < playtime; i += 5) {
			si_goal++;
		}
		System.out.println(now_score + si_goal);

	}

}
