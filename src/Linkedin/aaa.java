package Linkedin;

import java.util.LinkedList;
import java.util.Queue;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int getInfluencer(boolean[][] followingMatrix){
	    
        if(followingMatrix == null || followingMatrix.length != followingMatrix[0].length)
            return -1;
    
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] checked = new boolean[followingMatrix.length];
        queue.offer(0);
        while(!queue.isEmpty()){
            int currentUser = queue.poll();
            boolean influencer = true;
            checked[currentUser] = true;
            for(int i=0; i<followingMatrix.length; i++){
                if(i == currentUser) continue;
                if(!followingMatrix[i][currentUser]){
                    if(!checked[i])
                        queue.offer(i);
                    influencer = false;
                }
            }
            if(influencer) return currentUser;
        }
        return -1;
    
    }

}
