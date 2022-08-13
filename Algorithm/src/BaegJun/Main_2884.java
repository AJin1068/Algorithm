package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2884 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int h = Integer.parseInt(st.nextToken()); // >> m<45 : h--; / h<2
		int m = Integer.parseInt(st.nextToken()); // >> m<45 : 60-(45-m) / else : 45-m

		// 0:30 0:45 0:50

		if (h == 0 && m < 45) {
			h = 23;
			m = 60 - (45 - m);
		} else if (h == 0 && m >= 45) {
			m = m - 45;
		} else if (m < 45) {
			h--; m = 60 - (45 - m);
		} else {
			 m = m - 45;
		}

		sb.append(h).append(" ").append(m);

		System.out.println(sb);

	}

}
