package ch7;

/*
피보나치 재귀
 */
public class ch7_04 {

  public int DFS(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else {
      return DFS(n - 2) + DFS(n - 1);
    }
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis(); // 코드 시작 시간
    ch7_04 T = new ch7_04();
    int n = 45;
    for (int i = 1; i <= n; i++) {
      System.out.println(T.DFS(i) + " ");
    }
    long endTime = System.currentTimeMillis(); // 코드 끝난 시간
    long durationTimeSec = endTime - startTime;

    System.out.println(durationTimeSec + "m/s"); // 밀리세컨드 출력
    System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
  }
}
