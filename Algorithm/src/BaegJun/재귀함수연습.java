package BaegJun;

import java.util.Scanner;

public class ����Լ����� {

	static String underbar = "";
	
	public static void recur(int n){
		
		String line = underbar;
		// ���� ����
		if(n==0) {
			System.out.println(line + n +  "������ �ܶ�!");
			return;
		}
		System.out.println(line + n + "�ݺ��Ǵ� ����");
		
		underbar += "----";
		
		recur(n-1);
		
		System.out.println(line + n+ "������ ����");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("�̰��� ù��° ����");
		recur(n);
		
		
	}

}
