package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1)
			return intervals;
 
		Collections.sort(intervals, new IntervalComparator());
        List<Interval> result = new ArrayList<Interval>();
        result.add(intervals.get(0));
        for(int i=1; i<intervals.size(); i++){
            Interval cur = intervals.get(i);
            if(cur.start < result.get(result.size()-1).end && cur.end < result.get(result.size()-1).end) continue;
            else if(cur.start <= result.get(result.size()-1).end && cur.end >= result.get(result.size()-1).end){
            	result.get(result.size()-1).end = cur.end;
            }
            else result.add(cur);
        }
 
        return result;
    }
	
	class IntervalComparator implements Comparator<Interval> {
		public int compare(Interval i1, Interval i2) {
			return i1.start - i2.start;
		}
	}

}


