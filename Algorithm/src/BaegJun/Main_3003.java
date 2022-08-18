package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3003 {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] chess =  {1, 1, 2, 2, 2, 8};
		int temp = 0;
		
		for(int i = 0; i < 6; i++) {
			temp = chess[i] - Integer.parseInt(st.nextToken());
			sb.append(temp).append(" ");
		}
		
		System.out.println(sb);
	}
}
