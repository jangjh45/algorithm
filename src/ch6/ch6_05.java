package ch6;

import java.util.HashMap;
import java.util.Scanner;

public class ch6_05 {

  public String solution(int n, int[] arr) {
    String answer = "U";

//    ----- 1번 방법 -----
//    Arrays.sort(arr);
//    int num = 0;
//    for (int i = 0; i < n; i++) {
//      if (num == arr[i]) {
//        answer = "D";
//        break;
//      }
//      num = arr[i];
//    }

//    ----- 2번 방법 -----
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      // 키를 가진 값이 맵에 존재하는 경우에는 해당 값을 가져와 1을 증가시키고,
      // 만약 그렇지 않은 경우에는 0으로 초기화한 뒤 1을 증가시키는 코드
      map.put(i, map.getOrDefault(i, 0) + 1);
      if (map.get(i) >= 2) {
        return "D";
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    ch6_05 T = new ch6_05();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, arr));
  }
}
