package ch7;
/*
재쉬함수는 스택프레임을 사용한다.
스택에는 매개변수정보, 지역변수정보, 복귀주소 정보
 */
public class ch7_01 {

  public void DFS(int n) { // 재귀함수
    if (n == 0) {
      return;
    } else {
      DFS(n - 1); // 자기가 자기를 호출
      System.out.print(n+" ");
    }
  }

  public static void main(String[] args) {
    ch7_01 T = new ch7_01();
    T.DFS(3);
  }
}

