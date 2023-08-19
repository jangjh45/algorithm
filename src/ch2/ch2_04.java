package ch2;

import java.util.Scanner;

public class ch2_04 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		
//		int num1 = 1, num2 = 1, num3 = 0;
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
//			num3 = num1+num2;
//			answer[i] = num3;
//			num1 = num2;
//			num2 = num3;
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		ch2_04 T = new ch2_04();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int x:T.solution(n)) {
			System.out.print(x+" ");
		}
	}
	
}
