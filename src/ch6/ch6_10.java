package ch6;

import java.util.Arrays;
import java.util.Scanner;

public class ch6_10 {

  public int count(int[] arr, int dist) {
    int cnt = 1; // 한마리 배치
    int ep = arr[0]; // 제일 왼쪽에 배치
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] - ep >= dist) { // arr[i] 지점에 말을 배치할 수 있는지 판별
        cnt++;
        ep = arr[i];
      }
    }
    return cnt;
  }

  public int solution(int n, int c, int[] arr) {
    int answer = 0;

    Arrays.sort(arr);
    int lt = 1; // 제일 왼쪽 마구간부터 시작해야한다.
    int rt = arr[n - 1]; // 마지막 마구간 번호
    while (lt <= rt) {
      int mid = (lt + rt) / 2; // 최대거리
      // 만약 c가 3마리이면 3마리가 배치되는지 판별하고
      // 가장 가까운 두 말의 최대 거리를 측정해야한다.
      if (count(arr, mid) >= c) {
        answer = mid;
        lt = mid + 1;
      } else {
        rt = mid - 1;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    ch6_10 T = new ch6_10();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, c, arr));
  }

}
