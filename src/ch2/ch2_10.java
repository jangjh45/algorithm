package ch2;

import java.util.Scanner;

public class ch2_10 {
	int[] dx = {-1, 0, 1, 0}; // 12시 시작해서 시계방향
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) { //4개의 방향 탐색 
					int nx = i+dx[k]; // i방향 좌표 조정  
					int ny = j+dy[k]; // j방향 좌표 조정 
					
					// ArrayIndexOutOfBoundsException 방 (경계선 탐지제거)
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;
					}
				}
			    if(flag) answer++; // 참이면 봉우리 1추가 
			}
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		ch2_10 T = new ch2_10();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
