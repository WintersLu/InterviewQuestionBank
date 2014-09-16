package Linkedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AllFactorsofNum {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		AllFactorsofNum.getPrimes(24, new ArrayList<Integer>());

		List<Integer> line = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = AllFactorsofNum.allComb(18, 2, line, result);
		
		int a = 0;
	}
	
	public static List<List<Integer>> allComb(int num, int low, List<Integer> line, List<List<Integer>> result ){
		
		for(int i=low; i<num; i++){
			if(num%i == 0 && num/i >= i){
				List<Integer> newLine = new ArrayList<Integer>(line);
				newLine.add(i);
				
				result = allComb(num/i, i, new ArrayList<Integer>(newLine), result);
				newLine.add(num/i);
				result.add(newLine);
			}
		}
		return result;
	}

}
