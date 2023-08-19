package ch5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) { // 문자열내용물을 문자배열로 해서 foreach문사용
			if(x=='(') { // 열린 괄호이면 푸시
				stack.push(x);
			}
			else { // 닫는 괄호이면...
				if(stack.isEmpty()) { // 닫는 괄호가 있으면 열린 괄호가 있어야함 그래서 NO
					return "NO";
				}
				else { // 여는 괄호 꺼내기 
					stack.pop();
				}
			}
		}
		if(!stack.isEmpty()) { // 비어있지 않으면 NO
			return "NO";
		}
		
		return answer; // 스택이 모두 비어있으면 괄호 순서OK
	}

	public static void main(String[] args) {
		ch5_01 T = new ch5_01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
