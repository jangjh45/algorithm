package ch1;

import java.util.Scanner;

public class ch1_02 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(x>=65 && x<=90) {
				answer += (char) (x+32);
			}
			else if(x>97 && x<=122) {
				answer += (char) (x-32);
			}
//			if(Character.isUpperCase(x)) {
//				answer += Character.toLowerCase(x);
//			}
//			else {
//				answer += Character.toUpperCase(x);
//			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ch1_02 T = new ch1_02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}
