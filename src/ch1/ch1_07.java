package ch1;

import java.util.Scanner;

public class ch1_07 {
	public String solution(String str) {
		String answer = "YES";
		
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				return "NO";
			}
		}
		
//		String answer = "NO";
//		String tmp = new StringBuilder(str).reverse().toString();
//		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		return answer;
	}
	

	public static void main(String[] args) {
		ch1_07 T = new ch1_07();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}

}