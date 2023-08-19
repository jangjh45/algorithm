package ch6;

import java.util.Scanner;

public class ch6_04 {

  public int[] solution(int size, int n, int[] arr) {

    int[] cache = new int[size]; // cache 사이즈

    for (int x : arr) {
      int pos = -1; // 인덱스 번호 위치
      for (int i = 0; i < size; i++) {
        if (x == cache[i]) {
          pos = i; // 캐시를 뒤짐
        }
      }
      // 캐시안에 같은 값이 있으면 pos에 인덱스 값을 저장
      if (pos == -1) { // pos가 -1이면 cache miss 이다.
        for (int j = size - 1; j >= 1; j--) {
          cache[j] = cache[j - 1]; // 캐시 안에 값을 뒤로 밀기
        }
      } else { // posrk -1이 아니면 cache hit 이다.
        for (int k = pos; k >= 1; k--) {
          cache[k] = cache[k - 1]; // hit가 된 위치 부터 뒤로 밀기
        }
      }
      cache[0] = x; // 첫번째 자리에 저장
    }


    return cache;

}

  public static void main(String[] args) {
    ch6_04 T = new ch6_04();
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(s, n, arr)) {
      System.out.print(x + " ");
    }
  }


}
