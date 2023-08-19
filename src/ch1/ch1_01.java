package ch1;

import java.util.Scanner;

public class ch1_01 {
	public int solution(String str, char c) {
		int answer = 0;
		
		// 1번 방벙
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		for(char x : str.toCharArray()) { // 문자열을 하나하나 분리시켜 문자배열을 만듬 
			if(x==c) { // String 문자열 안의 문자를 하나씩 접근
				answer++;
			}
		}
		
		// 2번 방법
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) { // String 문자열 안의 문자를 하나씩 접근
				answer++;
			}
		}
		System.out.println(str+" "+c);
		
		return answer;
	}
	
	public static void main(String[] args) {
		ch1_01 T = new ch1_01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 문자열 하나 읽어옴
		char c = sc.next().charAt(0); // 문자열에서 0번째 문자를 가지고온다.
		System.out.print(T.solution(str,c));
	}

}
