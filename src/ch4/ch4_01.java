package ch4;

import java.util.HashMap;
import java.util.Scanner;

public class ch4_01 {
	public char solution(int n, String s) {
		char answer = 0;
		
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {	
			// map.getOrDefault - 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본값을 반환하는 메서드
			// x가 A가 나왔으면 (초기상태 map은 아무값도 없음) 키 A를 만들고 키값을 +1 함 그럼 첫번째 키와 키값이 생성 
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		System.out.println(map.containsKey('F')); // F라는 키가 있냐?? -> False
		System.out.println(map.size()); // 키의 개수 -> 5
		System.out.println(map.remove('A')); // 키를 삭제 (콘솔에 출력된 숫자는 값이다.)
		System.out.println(map.size()); // 키의 개수 -> 4
		
		for(char key : map.keySet()) {
//			System.out.println(key+" "+map.get(key));
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ch4_01 T = new ch4_01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
}
