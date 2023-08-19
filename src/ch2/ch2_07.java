package ch2;

import java.util.Scanner;

public class ch2_07 {
	public int solution(int n, int[] arr) {
		int answer = 0;
		
		int cnt = 0, sum =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				cnt++;
				sum += cnt;
			}
			else {
				cnt = 0;
			}
		}
		answer = sum;
		return answer;
 	}
	
	public static void main(String[] args) {
		ch2_07 T = new ch2_07();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}
