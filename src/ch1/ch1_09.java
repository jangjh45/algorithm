package ch1;

import java.util.Scanner;

public class ch1_09 {
	public int solution(String str) {
//		int answer = 0;
		String answer = "";
		
		for(char c : str.toCharArray()) {
//			if(c>=48 && c<=57) {
//				answer = answer*10+(c-48);
//			}
			
			if(Character.isDigit(c)) {
				answer += c;
			}
		}
		
//		return answer;
		return Integer.parseInt(answer);
	}
	

	public static void main(String[] args) {
		ch1_09 T = new ch1_09();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}