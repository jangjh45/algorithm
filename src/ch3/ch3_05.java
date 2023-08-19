package ch3;

import java.util.Scanner;

public class ch3_05 {
	public int solution(int n) {
		int answer = 0, sum = 0;
				
//		int cntmin = 1;
//		for(int i=0; i<n; i++) {
//			sum += i;
//			if(sum==n) {
//				answer++;
//			}
//			while(sum>n) {
//				sum -= cntmin;
//				cntmin++;
//				if(sum==n) {
//					answer++;
//				}
//			}
//		}
		
		int lt = 0;
		int m = n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = i+1;
		}
		for(int rt=0; rt<m; rt++) {
			sum += arr[rt];
			if(sum==n) {
				answer++;
			}
			while(sum>n) {
				sum -= arr[lt++];
				if(sum==n) {
					answer++;
				}
			}
			
		}
		
		return answer;
		
	}

	
	public static void main(String[] args) {
		ch3_05 T =new ch3_05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
