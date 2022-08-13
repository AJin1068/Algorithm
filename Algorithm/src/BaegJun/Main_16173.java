package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16173 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		
		int[][] s = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
		  for (int j = 0; j < n; j++) {
			  s[i][j] = Integer.parseInt(st.nextToken());
		  }
		}
		
		Queue<Integer[]> q = new LinkedList<>();
		
		while(q.isEmpty()) {
			
			
			
			
			
		}

	}

}
