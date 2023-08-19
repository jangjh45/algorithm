package ch6;

import java.util.Scanner;

public class ch6_01 {
    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1 + i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ch6_01 T = new ch6_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
