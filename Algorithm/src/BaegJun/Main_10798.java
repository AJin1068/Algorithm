package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_10798 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[][] a = new char[5][15];
		int max = 0;

		for (int i = 0; i < 5; i++) {
			String n = sc.next();

			for (int j = 0; j < n.length(); j++) {
				a[i][j] = n.charAt(j);
			}

		}

		// �迭�� ���� ������ ����� ũ�⸸ŭ�� ��� ������. null�� �� ũ�⿡ ���Ե��� �ʱ� ������
		// null���������� ���� ������ �� �迭�� ���̸� �����ϰԵ�
		// �迭�� ���� ��������, �� �׸�ŭ�� ������ ������ ������
		// a.length���� ���� : �������� >> length�� �Է°� ��ŭ��
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {

				if (a[j][i] == '\0')
					continue;

				System.out.printf("%c", a[j][i]);

			}

		}

		// if(chs[j][i]==' ' || chs[j][i]=='\0')continue;// ����� �� ��, ������ �ε����� ���� �Ǵ� null
		// ���� �� ���, �Ѿ�� ��� ���� ( continue )
		// if(cWord[j][i] == '\0')continue; // char �迭�� �ʱ갪 = '\0'
		// if(ch[j][i] == '\0') continue; sb.append(ch[j][i]);

	}

}
