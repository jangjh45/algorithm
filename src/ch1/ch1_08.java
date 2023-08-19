package ch1;

import java.util.Scanner;

public class ch1_08 {
	public String solution(String str) {
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // A부터 Z가 아니면 빈 문자로 바꿈
//		System.out.println(str);
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		ch1_08 T = new ch1_08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(T.solution(str));
	}
}
