package BaegJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17478 {

	static String underline = "";

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

		recursion(n);

	}

	public static void recursion(int n) {

		String line = underline;

		if (n == 0) {

			System.out.println(line + "\"재귀함수가 뭔가요?\"");
			System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.println(line + "라고 답변하였지.");

			return; // 자기 자신을 호출한 곳(recursion(1))으로 돌아감
		}

		System.out.println(line + "\"재귀함수가 뭔가요?\"");
		System.out.println(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

		underline += "____";

		recursion(n - 1);

		System.out.println(line + "라고 답변하였지.");
	}

}
