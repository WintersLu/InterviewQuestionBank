package LeetCode;

public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber instance = new SingleNumber();
		int[] input = {1, 2, 3, 3, 2};
		System.out.println(instance.singleNumber(input));
	}
	
	public int singleNumber(int[] A) {
        int tmp = 0;
        for(int i=0; i<A.length; i++)
        {
            tmp = tmp^A[i];
        }
        return tmp;
    }

}
