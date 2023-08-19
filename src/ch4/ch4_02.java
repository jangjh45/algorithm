package ch4;

import java.util.HashMap;
import java.util.Scanner;

public class ch4_02 {
	public String solution(String str1, String str2) {
		String answer = "YES";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c1 : str1.toCharArray()) {
			map.put(c1, map.getOrDefault(c1, 0)+1); // 키에 키값을 +1 씩 추가 (ch4_01 참고)
		}
		for(char c2 : str2.toCharArray()) {
			if(!map.containsKey(c2) || map.get(c2)==0) {
				return "NO";
			}
			map.put(c2, map.get(c2)-1); // c1이랑 c2가 같으면 키값 -1 최종적으로 0이 되어야 YES됨
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ch4_02 T = new ch4_02();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(T.solution(str1, str2));
	}
}
