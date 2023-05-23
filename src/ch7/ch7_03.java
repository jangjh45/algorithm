package ch7;

/*
팩토리얼 문제
ex) 5! -> 5*4*3*2*1 = 120
 */
public class ch7_03 {

  public int DFS(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * DFS(n - 1);
    }
  }

  public static void main(String[] args) {
    ch7_03 T = new ch7_03();
    System.out.println(T.DFS(5));
  }

}
