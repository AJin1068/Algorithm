package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int w = 0, h = 0, n = 0;

		w = sc.nextInt();// ���� �ʺ�
		h = sc.nextInt();// ���� ����
		n = sc.nextInt();// ����� ����

		int[][] a = new int[n][4]; // ����� ���� �迭�� �Է¹ޱ�

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = sc.nextInt(); // 2 0 1 1 (1 2)
			} // 3 1 2 3 (3 3)(4 3)
		} // 4 1 2 5 (3 5)(4 5)(5 5)

		int[][] b = new int[w][h]; // ���� ����� ���� �� ���

		for (int i = 0; i < n; i++) {// ����� ������ŭ l d x y �� �پ� ������

			int l = a[i][0];
			int d = a[i][1];
			int x = a[i][2] - 1;//���� ������ ������ ����ֱ� ���� �̷��� -1 �ϴ°� ����
			int y = a[i][3] - 1;

			for (int j = 0; j < l; j++) {

				if (d == 0) {// �����϶�
					b[x][y++] = 1;// �迭ũ�� Ƚ����ŭ ����⼼��

				} else if (d == 1) {// �����϶�
					b[x++][y] = 1;
				}
			}
		} // end for
			// Integer.parseInt(Arrays.deep(a[1][2]),1);
			// ������ �迭���� Ư�� ���� �����ϴ°� ��ƴ�...

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {

				System.out.printf("%d ", b[i][j]);
			}
			System.out.println();
		}

	}

}
