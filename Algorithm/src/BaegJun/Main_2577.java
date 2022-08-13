package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2577 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int mlp = 1; // 17037300정수

		for (int i = 0; i <= 2; i++) {

			st = new StringTokenizer(br.readLine());

			mlp = mlp * (Integer.parseInt(st.nextToken()));

		}

		String s_mlp = String.valueOf(mlp);// 1703730스트링

		int[] arr = new int[10];// 수 0~9
		
		for (int i = 0; i < s_mlp.length(); i++) {

			arr[(s_mlp.charAt(i)) - 48]++; // Index 49 out of bounds for length 10

		}

		for (int i = 0; i < arr.length; i++) {

			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}

}
