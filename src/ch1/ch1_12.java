package ch1;

import java.util.Scanner;

public class ch1_12 {
	public String solution(int n, String str) {
		String answer = "";
		
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			int num = Integer.parseInt(tmp, 2); // 2진수 -> 10진수
			answer += (char)num;
			str=str.substring(7); // index 0부터 6까지 짜르고 7부터 끝까지 저장
		}
		return answer;
	}
	

	public static void main(String[] args) {
		ch1_12 T = new ch1_12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.print(T.solution(n, str));
	}

}