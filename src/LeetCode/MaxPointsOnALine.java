package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {

	public static void main(String[] args) {
		MaxPointsOnALine m = new MaxPointsOnALine();
		Point p1= new Point(-4,1);
		Point p2 = new Point(-7,7);
		Point p3 = new Point(-1,5);
		Point p4 = new Point(9,-25);
		Point[] input = {p1, p2, p3, p4};
		m.maxPoints(input);

	}
	
	

	public int maxPoints(Point[] points) {
		if(points.length <= 1) return points.length;
		HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		int result = 0;
		for(int i=0; i<points.length; i++){
			map.clear();
			
			int base = 0;
			for(int k=0; k<points.length; k++){
				double slop = Double.MAX_VALUE;
				
				if(points[i].y == points[k].y && points[i].x == points[k].x){
					base++;
				}else {
					if(points[i].y != points[k].y){
						slop = ((double)points[i].x - (double)points[k].x) / ((double)points[i].y - (double)points[k].y);
					}
					if(map.containsKey(slop))
						map.put(slop, map.get(slop)+1);
					else map.put(slop, 1);
				}

			}
			for(Map.Entry<Double, Integer> entry:map.entrySet()){
				entry.setValue(entry.getValue() + base);
			}
			for(Map.Entry<Double, Integer> entry:map.entrySet()){
				if(entry.getValue() > result) result = entry.getValue();
			}
			if(base > result) result = base;
			
		}
		return result;
	}

}
