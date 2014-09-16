package LeetCode;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, total = 0;
        int start = -1;
        for(int i=0; i<gas.length; i++){
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0) {
                start = i;
                sum = 0;
            }
        }
        if(total < 0) return -1;
        else return start+1;
    }

}
