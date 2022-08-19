package BaegJun;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11720 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int cnt = Integer.parseInt(br.readLine());
		String numStr = br.readLine();
		int num = 0;

		for (int i = 0; i < cnt; i++) {

			num = num + numStr.charAt(i) - '0';
		}

		System.out.println(num);

	}
}
