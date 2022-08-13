package BaegJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2480 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());// 이미 333이 있음
		List<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			sb.append(a.get(i)).append(" ");
		}
		
		System.out.println(sb);
	}

}
