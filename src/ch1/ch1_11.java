package ch1;

import java.util.Scanner;

public class ch1_11 {
	public String solution(String str) {
		String answer = "";
		str = str+" ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++)
			if(str.charAt(i)==str.charAt(i+1)) {
				cnt++;
			}
			else {
				answer += str.charAt(i);
				if(cnt>1) {
					answer += cnt; 
				}
				cnt = 1;
			}
		
		return answer;
	}
	

	public static void main(String[] args) {
		ch1_11 T = new ch1_11();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}

}