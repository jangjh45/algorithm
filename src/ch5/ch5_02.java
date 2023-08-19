package ch5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_02 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == ')') { // 닫는 괄호가 나오면...
				while (stack.pop() != '(') // 열린 괄호 전까지 팝된다.
					;
			} else {
				stack.push(x); // 닫는 괄호 나올때까지 푸시
			}

		}
		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		ch5_02 T = new ch5_02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
