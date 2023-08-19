package ch4;

import java.util.HashMap;
import java.util.Scanner;

public class ch4_04 {
	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		char[] bc = b.toCharArray();
		for(int i=0; i<b.length(); i++) {
			bm.put(bc[i], bm.getOrDefault(bc[i], 0)+1);
		}
		
		int L = b.length()-1;
		for(int i=0; i<L; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		}
		
		int lt = 0;
		for(int rt=L; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) {
				answer++;
			}
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) {
				am.remove(a.charAt(lt));
			}
			lt++;
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		ch4_04 T = new ch4_04();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.print(T.solution(a, b));
	}
}
