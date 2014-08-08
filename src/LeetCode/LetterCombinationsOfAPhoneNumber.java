package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();
		l.letterCombinations("23");

	}
	
	
	public List<String> letterCombinations(String digits) {
        String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        List<String> result = new ArrayList<String>();
        result.add("");
        
        for(int i=0; i<digits.length(); i++){
            
            
            int num = Character.getNumericValue(digits.charAt(i));
            String chars = key[num];
            List<String> row = new ArrayList<String>();
            
            for(int k=0; k<chars.length(); k++){
                for(int l=0; l<result.size(); l++){
                    row.add(result.get(l) + chars.charAt(k));
                }
            }
            result = row;
        }
        return result;
    }

}
