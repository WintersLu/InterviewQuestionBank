package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public static void main(String[] args) {
		PascalsTriangleII pt = new PascalsTriangleII();
		pt.getRow(3);
	}
	
	
	public List<Integer> getRow(int rowIndex) {
        int[] curRow = new int[rowIndex+1];
        int[] preRow = curRow;
        List<Integer> result = new ArrayList<Integer>();
        if(rowIndex == 0){
            result.add(1);
            return result;
        }
        
        for(int i=2; i<=rowIndex+1; i++){
            for(int k=0; k<i; k++){
                if(k == 0 || k == i-1) curRow[k] = 1;
                else curRow[k] = preRow[k-1] + preRow[k];
            }
            preRow = curRow.clone();
        }
        for(int i=0; i<rowIndex+1; i++){
            result.add(curRow[i]);
        }
        return result;
    }

}
