package CodeUp;

import java.util.Scanner;

public class Main_1165 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();// ���� �ð�
		// int�� ���� �� �ϳ��� �޾ƿ�
		// time, now_score�� ���� ���ĵ� ���� ��
		
	    int now_score = sc.nextInt();// �츮���� ����
	    // (90 - ����ð�) 5�п� �� ���� now_score(++)�� ����
	    
		for (int i = 0; i < 90-time; i += 5) {
			now_score++;
		}
		System.out.println(now_score);

	}

}
