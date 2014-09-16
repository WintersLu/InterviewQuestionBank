package Linkedin;

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		Isomorphic w = new Isomorphic();
		System.out.println(w.mapword("abbc", "bbbd"));
	}
	
	
	public boolean mapword(String word1, String word2){
		if(word1 == null || word2 == null || word1.length() != word2.length())
			return false;
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(int i=0 ; i<word1.length(); i++){
			char c = word2.charAt(i);
			if(map.containsKey(c)){
				if(map.get(c) != word1.charAt(i))
					return false;
			}
			else map.put(c, word1.charAt(i));
		}
		
		return true;
	}

}
