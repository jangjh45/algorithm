package ch7;

public class ch7_02 {

  public void DFS(int n) {
    if (n == 0) {
      return;
    } else {
      DFS(n/2);
      System.out.print(n%2+" ");
    }
  }

  public static void main(String[] args) {
    ch7_02 T = new ch7_02();
    T.DFS(11);
  }
}
