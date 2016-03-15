package Amazon;

import java.util.HashSet;
import java.util.Set;

public class EliminateAllVowels {

	public static void main(String[] args) {
		if(mine("aeiOU ").equals(removeVowels("aeiOU ")))
			System.out.println("YES");
		else System.out.println("no");
	}
	
	public static String mine(String input){
		StringBuffer sb = new StringBuffer();
		Set<Character> v = new HashSet<Character>();
		v.add('a');v.add('e');v.add('i');v.add('o');v.add('u');
		v.add('A');v.add('E');v.add('I');v.add('O');v.add('U');
		for(int i=0; i<input.length(); i++){
			if(!v.contains(input.charAt(i)))
				sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	
	public static String removeVowels(String input){
		StringBuffer sb = new StringBuffer();
		String v = "aeiouAEIOU";
		for(int i=0; i<input.length(); i++){
			if(v.indexOf(input.charAt(i)) > -1) continue;
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	
	public static String removeVowels2(String input){
		StringBuffer sb = new StringBuffer();
		String v = "aeiouAEIOU";
		for(int i=0; i<input.length(); i++){
			char c = input.charAt(i);
			if(v.indexOf(c) == -1) sb.append(c);
		}
		return sb.toString();
	}

}
