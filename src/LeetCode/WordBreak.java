package LeetCode;

import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean wordBreak(String s, Set<String> dict) {
		
		boolean[] array = new boolean[s.length()+1];
		array[0] = true;
		
		for(int i=0; i<s.length(); i++){
			if(!array[i]) continue;
			
			for(String word : dict){
				int len = word.length();
				if(i+len > s.length()) continue;
				
				String sub = s.substring(i, i+len);
				if(sub.equals(word))
					array[i+len] = true;
			}
		}
		
		return array[s.length()];
	}
	
	
	

}
