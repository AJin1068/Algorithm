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

		// 배열에 값을 넣으면 저장된 크기만큼만 출력 가능함. null은 그 크기에 포함되지 않기 떄문에
		// null제외조건을 주지 않으면 총 배열의 길이를 오버하게됨
		// 배열의 값은 가변적임, 딱 그만큼만 돌리지 않으면 에러남
		// a.length쓰는 이유 : 가변길이 >> length는 입력값 만큼만
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {

				if (a[j][i] == '\0')
					continue;

				System.out.printf("%c", a[j][i]);

			}

		}

		// if(chs[j][i]==' ' || chs[j][i]=='\0')continue;// 출력을 할 떄, 참조한 인덱스가 공백 또는 null
		// 문자 일 경우, 넘어가고 계속 진행 ( continue )
		// if(cWord[j][i] == '\0')continue; // char 배열의 초깃값 = '\0'
		// if(ch[j][i] == '\0') continue; sb.append(ch[j][i]);

	}

}
