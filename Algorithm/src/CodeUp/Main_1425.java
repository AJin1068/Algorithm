package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1425 {

	public static void main

	(String[] args) {
		// TODO Auto-generated method stub

		// for�� �迭 ���� ���� �����ϱ� ���� �ߵ����� Ȯ���ؾ���
		// nextint�� ������ �ϳ����� �޴´ٰ� �����ϸ� ��

		int line_stu;

		Scanner sc = new Scanner(System.in);
		//
		int all = sc.nextInt();// 11
		int jari = sc.nextInt();// 3
		int[] all_stu = new int[all];
		String gongbek = " ";

		for (int i = 0; i < all; i++) {
			all_stu[i] = sc.nextInt();
		}
		Arrays.sort(all_stu);

		for (int j = 1; j <= all; j++) {
			
			System.out.printf("%d ", all_stu[j-1]);
			
			if (j  % jari == 0) {
				System.out.println();	
			}
			
		}

	}

}
