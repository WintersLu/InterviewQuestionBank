package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations p = new Permutations();
		int[] input = {1, 2, 3};
		ArrayList<ArrayList<Integer>> result = p.permute2(input);
		System.exit(0);
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
                	if(j<temp.size() && temp.get(j) == num[i]) continue;
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
	
	
	
	
	
	
	public ArrayList<ArrayList<Integer>> permute2(int[] num) {  
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();  
        ArrayList<Integer> tmp = new ArrayList<Integer>();  
        int n = num.length;  
        boolean[] visited = new boolean[n];  
          
        permuteImp(res, tmp, num, visited);
        return res;  
    }
    
	private void permuteImp(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int[] num, boolean[] visited){  
        if(tmp.size() == num.length){  
            res.add(new ArrayList<Integer>(tmp));  
            return;  
        }  
        for(int i=0; i<num.length; i++){  
            if(!visited[i]){
                tmp.add(num[i]);  
                visited[i] = true;
                permuteImp(res, tmp, num, visited);  
                visited[i] = false;
                tmp.remove(tmp.size()-1);  
            }
        }
    }  
	
	
	

}
