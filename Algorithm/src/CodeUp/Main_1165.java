package CodeUp;

import java.util.Scanner;

public class Main_1165 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();// 현재 시간
		// int는 공백 띄어서 하나씩 받아옴
		// time, now_score에 엔터 안쳐도 따로 들어감
		
	    int now_score = sc.nextInt();// 우리팀의 득점
	    // (90 - 현재시간) 5분에 한 번씩 now_score(++)이 증가
	    
		for (int i = 0; i < 90-time; i += 5) {
			now_score++;
		}
		System.out.println(now_score);

	}

}
