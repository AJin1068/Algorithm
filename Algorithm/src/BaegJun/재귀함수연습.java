package BaegJun;

import java.util.Scanner;

public class 재귀함수연습 {

	static String underbar = "";
	
	public static void recur(int n){
		
		String line = underbar;
		// 종료 조건
		if(n==0) {
			System.out.println(line + n +  "마지막 단락!");
			return;
		}
		System.out.println(line + n + "반복되는 문장");
		
		underbar += "----";
		
		recur(n-1);
		
		System.out.println(line + n+ "마지막 문장");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("이것은 첫번째 문장");
		recur(n);
		
		
	}

}
