package ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch5_06 {
    public int solution(int n, int k) {
        int answer = 0;

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i); // 숫자 1부터 값을 넣어야함
        while (!Q.isEmpty()) { // 비어있지 않으면 계속 작동
            for (int i = 1; i < k; i++) { // 왕이 외친 k값을 꺼내기 위해 1부터 시작
                Q.offer(Q.poll()); // 꺼내고 다시 넣기 (꺼내고 다시 반환)
            }
            Q.poll();
            if (Q.size()==1) answer = Q.poll(); // 값이 1개 남으면 정답
        }
        return answer;
    }

    public static void main(String[] args) {
        ch5_06 T = new ch5_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n,k));
    }
}
