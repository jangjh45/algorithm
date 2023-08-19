package ch6;

import java.util.Arrays;
import java.util.Scanner;

public class ch6_09 {

  public int count(int[] arr, int capacity) {
    // 몇장의 DVD가 필요한지 를 반환
    // 만약 arr에 1,2,3,4,5,6,7,8,9가 오고 capacity에 17이 오면
    // (1,2,3,4,5 1장)  (6,7 2장)  (8,9 3장) 이다.
    int cnt = 1, sum = 0;
    for (int x : arr) {
      if (sum + x > capacity) {
        // sum 과 x 를 더했을때 capacity보다 크면 1장 추가
        cnt++;
        sum = x;
      } else {
        sum += x;
      }
    }
    return cnt;
  }

  public int solution(int n, int m, int[] arr) {
    int answer = 0;

    int lt = Arrays.stream(arr).max().getAsInt();
    // arr 중 가장 높은 값 (반환 값이 Optional int 라서 getAsint() 써야함
    int rt = Arrays.stream(arr).sum();
    // arr 안에 있는 값 다 더하기
    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (count(arr, mid) <= m) {
        // count 메서드 반환값이 m보다 작거나 같은면 OK
        answer = mid;
        rt = mid - 1; // mid 보다 큰 범위는 의미가 없다.
      } else {
        lt = mid + 1; // mid 보다 작은 범위는 의미가 없다.
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    ch6_09 T = new ch6_09();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, m, arr));
  }

}
