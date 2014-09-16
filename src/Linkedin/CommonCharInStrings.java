package Linkedin;

import java.util.HashSet;
import java.util.Set;

public class CommonCharInStrings {

	public static void main(String[] args) {
		String[] inputs = {"aghkafgklt", "dfghako", "qwemnaarkf"};
		System.out.println(CommonCharInStrings.getNumOfCommonChars(inputs));
	}
	
	
	public static int getNumOfCommonChars(String[] inputs){
		if(inputs == null || inputs.length <2)return 0;
		
		Set<Character> result = new HashSet<Character>();
		int count = 0;
		for(String input: inputs){
			Set<Character> tmp = new HashSet<Character>();
			for(int i=0; i<input.length(); i++){
				tmp.add(input.charAt(i));
			}
			if(count==0){
				result = tmp;
			}else{
				result.retainAll(tmp);
			}
			count++;
		}
		return result.size();
	}

}
