package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		double[] scoreArray = new double[num];
		double max = 0;
		double score = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {

			scoreArray[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, scoreArray[i]);
		}

		for (int i = 0; i < num; i++) {
//			scoreArray[i] = scoreArray[i] / max * 100;
			score = score + (double) scoreArray[i];
		}

		System.out.println(score/max*100/num);

	}

}
