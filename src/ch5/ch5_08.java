package ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class ch5_08 {
    public int solution(int n, int m, int[] arr) {
        int answer =0;

        Queue<Person> Q = new LinkedList<>(); // 큐 생성
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i])); // 큐에 사람에 id와 값의 객체를 하나씩 넣음
        }
        while (!Q.isEmpty()) { // 큐에 비어있지 않으면 계속 반복
            Person tmp = Q.poll(); // 제일 앞에 있는 환자가 먼저 진료를 볼 수 있냐? 큐를 하나를 꺼냄
            for (Person x : Q) { // 큐에 있는 모든 것을 검사
                if (x.priority > tmp.priority) { // 진료 우선순위 확인
                    Q.offer(tmp); // 우선순위가 높은 환자가 있다면 후 순위로 넘김
                    tmp = null;
                    break; // 후 순위로 밀렸으면 끝
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id==m) return answer;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        ch5_08 T = new ch5_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
