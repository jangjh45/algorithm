package ch5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_04 {
	public int  solution(String str) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()) { // foreach문은 배열이나 컬렉션에서 사용가능
			if(Character.isDigit(x)) { // 문자가 숫자 인가? 
				stack.push(x-48);
				// 지금 stack이 Integer이니까 문자를 숫자로 변환해야함
				// 참이면 문자인 숫자를 Integer로 변환
				// 아스키 코드 0이 48이고 만약 숫자 '5'이면 53-48=5 가됨.
			}
			else {
				int rt = stack.pop(); // 처음 나온거 rt
				int lt = stack.pop(); // 나중에 나온거 lt로 둔다.
				if(x=='+') stack.push(lt+rt); 
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		ch5_04 T = new ch5_04();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
