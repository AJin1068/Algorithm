package CodeUp;

import java.util.Scanner;

public class Main_1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이끌어가는 변수를 프로그래밍에 따라 변하게 두면 xx
		// 벗어나는것도 생각하기(else)
		// 시작지점에 뭔가 있는걸 고려하지 않안ㅆ따....
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[11][11];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		int c = 1; // 열
		int r = 1; // 행
		// 밑에 1이 있을때도 만들기 //이차원배열이라 length주면xx 안됨
		OUT: for (int i = 0; i < a.length; i++) { // 1,1부터
			for (int j = 0; j < a[i].length; j++) {
				// 베이스: 주변을 미리 살펴보고, 내 자리에 9주고, 이동
				if (a[r + 1][c] == 2 ) {// 밑2일때
					a[r][c] = 9;
					r++;
					a[r][c] = 9;
					break OUT;
				} else if (a[r][c + 1] == 2) {// 오른쪽2일때
					a[r][c] = 9;
					c++;
					a[r][c] = 9;
					break OUT;
				}
				if (a[r][c + 1] == 1 && a[r + 1][c] == 1) {// 오른쪽1 ,밑1일때
					break OUT;
				} else if (a[r][c + 1] == 1 && a[r + 1][c] == 0) {// 오른쪽1,밑0(not2)일때
					a[r][c] = 9;
					r++;
				} else if (a[r][c + 1] == 0) {//모든 경우의수를 제외하고 오른쪽이 순수하게 0일때
					a[r][c] = 9;
					c++;
				} else {
					break OUT;
				}
//숙제 : 더 줄이자 
			}
		} // end for

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}

	}

}
