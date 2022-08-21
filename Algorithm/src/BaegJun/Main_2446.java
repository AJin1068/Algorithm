package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2446 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			sb.append(" ".repeat(i-1)).append("*".repeat((2*N)-(2*i-1))).append("\n");
		}
		
		for(int i = N-1; i >= 1; i--) {
			
			sb.append(" ".repeat(i-1)).append("*".repeat((2*N)-(2*i-1))).append("\n");
		}
		
		System.out.println(sb);
	}

}
