package ch1;

import java.util.Scanner;

public class ch1_06 {
	public String solution(String str) {
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		ch1_06 T = new ch1_06();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}
