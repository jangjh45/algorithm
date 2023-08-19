package ch5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_03 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) { // 보드에서 한칸씩 내려가면 숫자를 찾으면
					int tmp = board[i][pos - 1]; // 값을 저장하고
					board[i][pos - 1] = 0; // 보드의 값을 0으로 만들고

					// 비어있지 않으면서 스택상단을 꺼내지않고 확인해서 값이 동일하면 +2, 하나 꺼내기
					if (!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					break; // 값을 넣고 또 for문 돌아서 다음 값을 넣으면 안됨
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		ch5_03 T = new ch5_03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(T.solution(board, moves));
	}
}
