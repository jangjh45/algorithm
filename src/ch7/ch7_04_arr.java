package ch7;

/*
피보나치 재귀(배열에 저장)
 */
public class ch7_04_arr {

  static int[] fibo;

  public int DFS(int n) {
    if (n == 1) {
      return fibo[n] = 1;
    } else if (n == 2) {
      return fibo[n] = 1;
    } else {
      return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis(); // 코드 시작 시간
    ch7_04_arr T = new ch7_04_arr();
    int n = 45;
    fibo = new int[n + 1];
    T.DFS(n);
    for (int i = 1; i <= n; i++) {
      System.out.println(T.DFS(i) + " ");
    }
    long endTime = System.currentTimeMillis(); // 코드 끝난 시간
    long durationTimeSec = endTime - startTime;

    System.out.println(durationTimeSec + "m/s"); // 밀리세컨드 출력
    System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
  }
}
