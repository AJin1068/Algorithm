package CodeUp;

import java.util.Scanner;

public class Main_1096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �� �� ���� ����, 19x19 �ٵ��� 2���迭 ����
		// int n�� �� �� ���� ��ġ ��ĳ�ʷ� �ް�
		// for�� �������� 19x19ũ��� n�� ����и��ϰ� ���۷� ���μ� �ֱ�
		// �ٸ� for������ 0,1 �ٵ��� 2���迭 ���
		Scanner sc = new Scanner(System.in);
		//StringBuffer sb = new StringBuffer(40);

		int n = sc.nextInt();
		int[][] a = new int[19][19];
		//���߿��� ���⸶�� Ž���� ���� ����>���� ��������� �����������⶧���� �迭ũ�⸦ 
		//�˳��ϰ� �����ϴ°� ����
		int x = 0;
		int y = 0;

		for (int i=0; i<n; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;

			for (int j=0; j<n; j++) {
				a[x][y] = 1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}

	}

}
