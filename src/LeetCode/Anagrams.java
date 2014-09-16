package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		String[] input = {"", ""};
		a.anagrams(input);

	}

	public List<String> anagrams(String[] strs) {
		List<String> result = new ArrayList<String>();
		if (strs == null || strs.length == 0)
			return result;

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : strs) {
			char[] strChars = str.toCharArray();
			Arrays.sort(strChars);
			String tmp = new String(strChars);
			if(map.containsKey(tmp)){
				map.get(tmp).add(str);
			}else{
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(tmp, list);
			}
		}
		
		for(java.util.Map.Entry<String, List<String>> entry : map.entrySet()){
			if(entry.getValue().size()>1){
				result.addAll(entry.getValue());
			}
		}
		return result;

	}

}
