package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1484 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�̷� �������� ���������� ���� �Է°� 1�̳� 0��ó���� �� ������..

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int r = Integer.parseInt(st.nextToken()); // �迭 width
		int c = Integer.parseInt(st.nextToken()); // �迭 height

		int[][] a = new int[r][c];

		int x = 0, y = 0;
		int count = 1;

		int dir = 0; // �������ø� ī�װ����� �����±� 0:�� 1:�� 2:�� 3:��
		a[x][y] = 1;

		for (int i = 0; i < r * c; i++) {
			
			if (dir == 0) {// ����� ���ٰ�
				
				if ((y + 1) == c || a[x][y + 1] != 0) {// �����ʳ�(������) or �����ʿ� �� ������
					dir = 1; //count�Ҵ� �ȵƴµ� i++�����Ƿ� i--�� ��������
					i--;
				}else {
					y++;
					count++;
					a[x][y] = count;
					
				}
			} else if (dir == 1) { // �Ϸ� �����ϴٰ�

				if ((x + 1) == r || a[x + 1][y] != 0) {// �س�(��������) or �ؿ� �� ������
					dir = 2;
					i--;
				}else {
					x++;
				count++;
				a[x][y] = count;
				
				}
			} else if (dir == 2) {// �������� ���ٰ�

				if ((y - 1) == -1 || a[x][y - 1] != 0) { // ���ʳ�(����) or ���ʿ� �� ������
					i--;
					dir = 3;
				}else {
				y--;
				count++;
				a[x][y] = count;
				}
			} else if (dir == 3) {// ���ΰ��ٰ�

				if (a[x - 1][y] != 0) {// ���� �� ������
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
