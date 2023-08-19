package ch1;

import java.util.Scanner;

public class ch1_03 {
	public String solution(String str) {
		String answer = "";

		int max = Integer.MIN_VALUE, pos; // -2147483648
		while ((pos = str.indexOf(' ')) != -1) { // 공백이 없으면 반복문 종료
			String tmp = str.substring(0, pos); // 첫번째 문자부터 pos값-1 까지 tmp에 저장
			int len = tmp.length();
			if (len > max) {
				max = len;
			}
			str = str.substring(pos + 1); // tmp에 있는 문장 제외 시킴
		}
		if(str.length()>max) {
			answer = str;
		}
//		String[] arr = str.split(" ");
//		for(String x : arr) {
//			int len = x.length();
//			if(len>max) {
//				max = len;
//				answer = x;
//			}
//		}

	return answer;

	}

	public static void main(String[] args) {
		ch1_03 T = new ch1_03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(T.solution(str));
	}

}
