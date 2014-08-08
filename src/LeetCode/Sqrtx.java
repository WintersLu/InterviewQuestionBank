package LeetCode;

public class Sqrtx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int sqrt(int x) {
        int start = 0;
        int end = x;
        if(x <= 1) return x;
        while(end-start>1){
            long middle = (start + end)/2;
            if(middle*middle > x) end = (int)middle;
            else if(middle*middle < x) start = (int)middle;
            else return (int)middle;
        }
        return (int)start;
        
    }

}
