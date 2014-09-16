package Linkedin;

import java.util.LinkedList;
import java.util.Queue;

public class MovingWindow {

	public static void main(String[] args) {
		MovingWindow m = new MovingWindow();
		m.push(2);
		System.out.println(m.getAverage());
		m.push(3);
		System.out.println(m.getAverage());
		m.push(6);
		System.out.println(m.getAverage());
		m.push(7);
		System.out.println(m.getAverage());
		m.push(0);
		System.out.println(m.getAverage());
	}

	Queue<Integer> queue = new LinkedList<Integer>();
	int windowSize = 10;
	int count = 0;
	int total = 0;

	public void push(int num) {
		queue.offer(num);
		if (count + 1 > windowSize) {
			total = total - queue.poll() + num;
		} else {
			count++;
			total = total + num;
		}
	}
	
	public double getAverage(){
		return (double)total/count;
	}
}
