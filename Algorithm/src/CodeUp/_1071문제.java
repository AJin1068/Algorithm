package CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class _1071���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();// ���� �ð�
		// int�� ���� �� �ϳ��� �޾ƿ�
		// time, now_score�� ���� ���ĵ� ���� ��
		int playtime = 90 - time;

		int now_score = sc.nextInt();// �츮���� ����
		int si_goal = 0;

		// (90 - ����ð�) 5�п� �� ���� si_goal(++)�� ����
		// last_score : now_score + si_goal
		for (int i = 0; i < playtime; i += 5) {
			si_goal++;
		}
		System.out.println(now_score + si_goal);

	}

}
