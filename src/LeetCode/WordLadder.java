package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int ladderLength(String start, String end, Set<String> dict) {
		
		
		Queue<String> queue = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();
		
		int level = 1;
		int lastNum = 1;
		int curNum = 0;
		queue.offer(start);
		visited.add(start);
		while(!queue.isEmpty()){
			String cur = queue.poll();
			lastNum--;
			
			for(int i=0; i<cur.length(); i++){
				char[] curChar = cur.toCharArray();
				for(char c='a'; c<='z'; c++){
					curChar[i] = c;
					String newTmp = new String(curChar);
					if(newTmp.equals(end))
						return level+1;
					if(dict.contains(newTmp) && !visited.contains(newTmp))
					{
						curNum++;
						queue.offer(newTmp);
						visited.add(newTmp);
					}
				}
			}
			if(lastNum == 0)
			{
				lastNum = curNum;
				curNum = 0;
				level++;
			}
		}
		return 0;
	}

}
