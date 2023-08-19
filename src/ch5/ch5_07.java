package ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch5_07 {
    public String solution(String need, String plan) {
        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();
        for (char c : need.toCharArray()) Q.offer(c); // 필수과목 큐에 넣기
        for (char x : plan.toCharArray()) { // 계획을 하나씩 꺼내서 확인
            if (Q.contains(x)) { // 만약 x값이 큐에 있으면 참
                if (x!=Q.poll()) return "NO"; // x에 값이 큐에서 꺼낸값과 다르면 NO
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        ch5_07 T = new ch5_07();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a,b));
    }
}
