package CodeUp;

import java.util.Scanner;

public class Main_1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for���� �̲���� ������ ���α׷��ֿ� ���� ���ϰ� �θ� xx
		// ����°͵� �����ϱ�(else)
		// ���������� ���� �ִ°� ������� �ʾȤ���....
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[11][11];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		int c = 1; // ��
		int r = 1; // ��
		// �ؿ� 1�� �������� ����� //�������迭�̶� length�ָ�xx �ȵ�
		OUT: for (int i = 0; i < a.length; i++) { // 1,1����
			for (int j = 0; j < a[i].length; j++) {
				// ���̽�: �ֺ��� �̸� ���캸��, �� �ڸ��� 9�ְ�, �̵�
				if (a[r + 1][c] == 2 ) {// ��2�϶�
					a[r][c] = 9;
					r++;
					a[r][c] = 9;
					break OUT;
				} else if (a[r][c + 1] == 2) {// ������2�϶�
					a[r][c] = 9;
					c++;
					a[r][c] = 9;
					break OUT;
				}
				if (a[r][c + 1] == 1 && a[r + 1][c] == 1) {// ������1 ,��1�϶�
					break OUT;
				} else if (a[r][c + 1] == 1 && a[r + 1][c] == 0) {// ������1,��0(not2)�϶�
					a[r][c] = 9;
					r++;
				} else if (a[r][c + 1] == 0) {//��� ����Ǽ��� �����ϰ� �������� �����ϰ� 0�϶�
					a[r][c] = 9;
					c++;
				} else {
					break OUT;
				}
//���� : �� ������ 
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
