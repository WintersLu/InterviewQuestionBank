package LeetCode;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations p = new Permutations();
		int[] input = {1, 2, 3};
		p.permute(input);
	}
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer>());
        
        for(int i=0;i<num.length;i++){
            ArrayList<ArrayList<Integer>> cur = new  ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> temp:res){
                for(int j=0;j<temp.size()+1;j++){
                    temp.add(j,num[i]);
                    ArrayList<Integer> temp1= new ArrayList<Integer>(temp);
                    cur.add(temp1);
                    temp.remove(j);
                }
            }
            res = new ArrayList<ArrayList<Integer>>(cur);
        }
        return res;
    }

}
