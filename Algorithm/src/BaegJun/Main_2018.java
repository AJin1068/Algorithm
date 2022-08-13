package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2018 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		int count = 0;
		int sum = 0;

		OUT : 
		for (int i = a; i > 0; i--) {
				sum = 0;
			for (int j = i; j > 0; j--) {
			
				if ((sum += j) == a) {
					count++;
					break;
				}
				else if(sum > a) {
					break;
				}		
			}
		
		}

		System.out.println(count + 1);

	}

}
