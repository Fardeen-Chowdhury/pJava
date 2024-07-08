package pPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		String str = "FFFFFardeeeeeeen";
		StringBuffer strr = new StringBuffer("Fardeen");
		char [] ch = str.toCharArray();
		
		for(char c : ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		System.out.println(map);
		
		for(int i=0; i<=ch.length-1; i++) {
			System.out.print(ch[i]);
		}
		System.out.println(" ");
		int count = 0;
		while(count < ch.length) {
		//	System.out.print(ch[count]);
			count++;
		}
		System.out.println(strr.reverse());
		
		char[] ch2 = new char[ch.length];
		int j=0;
		for(int i=ch.length-1; i>=0; i-- ) {
			ch2[j]= ch[i];
			j++;
			
		}
		for(char c : ch2) {
			System.out.print(c);
		}
	}

}
