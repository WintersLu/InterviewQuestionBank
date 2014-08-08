package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        
        List<Interval> result = new ArrayList<Interval>();
        for(int i=0; i<intervals.size(); i++){
        	if(intervals.get(i).end < newInterval.start){
        		result.add(intervals.get(i));
        	}else if(intervals.get(i).start > newInterval.end){
        		result.add(newInterval);
        		newInterval = intervals.get(i);
        	}else if(intervals.get(i).end >= newInterval.start || 
        			intervals.get(i).start <= newInterval.end){
        		newInterval = new Interval(
        				Math.min(intervals.get(i).start, newInterval.start),
        				Math.max(intervals.get(i).end, newInterval.end));
        	}
        }
        result.add(newInterval);
        return result;
    }
}
