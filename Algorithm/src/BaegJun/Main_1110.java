package BaegJun;

import java.util.Scanner;

public class Main_1110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// n / (one*10 + (ten*10 + one)%10))

		int n = sc.nextInt(); // �Է¹��� ��
		int nn = n; // �������� n�� ���Ϸ��� n�� �ջ�Ǹ� �ȵ�

		int count = 0;

		while (true) {

			// ���⿡ n�� �־�� �ϱ� ������ ���ؾ��ϴ� nn���� ���� ����������
			// nn�� �ݺ����ȿ� ���־ ���� �����....(ġ���Ե���)
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);

			count++;
			if (n == nn) {
				break;
			}
		}

		System.out.println(count);

	}
}