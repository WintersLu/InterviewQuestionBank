package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
//		String[] input = {"This", "is", "an", "example", "of", "text", "justification."};

		String[] input = {""};
		TextJustification t = new TextJustification();
		t.fullJustify(input, 2);

	}

	public List<String> fullJustify(String[] words, int L) {
		if(words == null || words.length == 0) return new ArrayList<String>();

		List<String> result = new ArrayList<String>();
		
		int lineCount = 0;
		List<String> line = new ArrayList<String>();
		
		for(int i=0; i<words.length; i++){
			
			lineCount += words[i].length();
			if(lineCount > L){
				result.add(process(line, L, lineCount - words[i].length() - 1));
				lineCount = 0;
				i--;
				line.clear();
			}else{
				line.add(words[i]);
				lineCount++;
			}	
		}
		if(line.size() != 0){
			String last = "";
			int lastCount = 0;
			for(int i=0; i<line.size(); i++){
				last += line.get(i);
				lastCount += line.get(i).length();
				if(lastCount < L){
					last += " ";
					lastCount++;
				}
			}
			result.add(addSpace(last, L-lastCount));
		}
		return result;
	}
	
	public String process(List<String> line, int L, int lineCount){
		int diff= L-lineCount;
		String result = "";
		
		if(line.size() == 1){
			result = line.get(0);
			result = addSpace(result, diff);
		}else{
			List<String> spaces = new ArrayList<String>();
			for(int i=0; i<line.size()-1; i++){
				spaces.add(" ");
			}
			int i=0;
			for(;diff>0; diff--){
				spaces.set(i, spaces.get(i) + " ");
				if( ++i >= spaces.size()) i=0;
			}
			for(int tmp=0; tmp<line.size(); tmp++){
				result += line.get(tmp);
				if(tmp < spaces.size()) result += spaces.get(tmp);
			}
		}
		return result;
	}
	
	public String addSpace(String input, int count){
		for(int i=0; i<count; i++)
			input += " ";
		return input;
	}

}
