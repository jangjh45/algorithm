package ch2;

import java.util.Scanner;

public class ch2_05 {
	public int solution(int n) {
		int answer = 0;
		
		int[] arr = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(arr[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		ch2_05 T = new ch2_05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}

}
