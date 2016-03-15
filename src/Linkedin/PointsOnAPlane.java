package Linkedin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import LeetCode.Point;

public class PointsOnAPlane {
	
	
	public static void main(String[] args) {
		PointsOnAPlane pa = new PointsOnAPlane();
		pa.addPoint(new Point(0,4));
		pa.addPoint(new Point(0,5));
		pa.addPoint(new Point(0,1));
		pa.addPoint(new Point(0,2));
		pa.addPoint(new Point(0,3));
		System.out.println(pa.findNearest(new Point(0,0), 3));
	}
	

	List<Point> points = new ArrayList<Point>();
	/**
     * Stores a given point in an internal data structure
     */
    void addPoint(Point point){
    	points.add(point);
    }

    /**
     * For given 'center' point returns a subset of 'm' stored points that are
     * closer to the center than others.
     *
     * E.g. Stored: (0, 1) (0, 2) (0, 3) (0, 4) (0, 5)
     *
     * findNearest(new Point(0, 0), 3) -> (0, 1), (0, 2), (0, 3)
     */
    Collection<Point> findNearest(Point center, int m){
    	
    	PriorityQueue<Point> pq = new PriorityQueue<Point>(10, new PointSort());
    	
    	for(Point point: points){
    		pq.add(pointCompare(point, center));
    	}
    	Collection<Point> result = new LinkedList<Point>();
    	for(int i=0; i<m; i++){
    		result.add(pointRecover(pq.poll(), center));
    	}
    	return result;
    }
    
    private Point pointCompare(Point point, Point center){
    	return new Point(point.x - center.x, point.y - center.y);
    }
    
    private Point pointRecover(Point point, Point center){
    	return new Point(point.x + center.x, point.y + center.y);
    }
    
    private class PointSort implements Comparator<Point>{

		@Override
		public int compare(Point o1, Point o2) {
			return o1.x * o1.x + o1.y * o1.y - o2.x * o2.x - o2.y * o2.y;
		}
    	
    }
	
}
