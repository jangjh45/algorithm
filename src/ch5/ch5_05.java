package ch5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_05 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(') stack.push('(');
            else {
                stack.pop();
                //바로 앞지점이 여는 괄호이면 스택에 있는 개수 더하기
                if (str.charAt(i-1)=='(') answer+=stack.size();
                else answer++; // 막대기 마지막 끝
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        ch5_05 T = new ch5_05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
