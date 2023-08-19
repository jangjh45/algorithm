package ch4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class ch4_05 {
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt =0;
		for (int x : tset) {
			cnt++;
			if(cnt==k) {
				return x;
			}
		}
			
		return answer;
	}

	public static void main(String[] args) {
		ch4_05 T = new ch4_05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
