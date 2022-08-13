package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1484 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//이런 문제에선 제출했을때 예제 입력값 1이나 0근처에서 꼭 실패함..

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int r = Integer.parseInt(st.nextToken()); // 배열 width
		int c = Integer.parseInt(st.nextToken()); // 배열 height

		int[][] a = new int[r][c];

		int x = 0, y = 0;
		int count = 1;

		int dir = 0; // 방향지시를 카테고리별로 나누는군 0:우 1:하 2:좌 3:상
		a[x][y] = 1;

		for (int i = 0; i < r * c; i++) {
			
			if (dir == 0) {// 우방향 가다가
				
				if ((y + 1) == c || a[x][y + 1] != 0) {// 오른쪽끝(밑으로) or 오른쪽에 뭐 있을때
					dir = 1; //count할당 안됐는데 i++됐으므로 i--로 돌려놓기
					i--;
				}else {
					y++;
					count++;
					a[x][y] = count;
					
				}
			} else if (dir == 1) { // 하로 전진하다가

				if ((x + 1) == r || a[x + 1][y] != 0) {// 밑끝(왼쪽으로) or 밑에 뭐 있을때
					dir = 2;
					i--;
				}else {
					x++;
				count++;
				a[x][y] = count;
				
				}
			} else if (dir == 2) {// 왼쪽으록 가다가

				if ((y - 1) == -1 || a[x][y - 1] != 0) { // 왼쪽끝(위로) or 왼쪽에 뭐 있을때
					i--;
					dir = 3;
				}else {
				y--;
				count++;
				a[x][y] = count;
				}
			} else if (dir == 3) {// 위로가다가

				if (a[x - 1][y] != 0) {// 위에 뭐 있을때
					dir = 0;
					i--;
				}else {
				x--;
				count++;
				a[x][y] = count;
				}
			}
			if (count == (r * c)) {
				break;
			}

		} // end for

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sb.append(a[i][j]).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
		
	
	}

}
