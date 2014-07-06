package LeetCode;

public class UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] path = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int i=0; i<obstacleGrid.length; i++){
            for(int k=0; k<obstacleGrid[0].length; k++){
                if(i==0 && k==0 && obstacleGrid[0][0]==0)
                    path[0][0] = 1;
                else if(i==0 && k==0 && obstacleGrid[0][0]==1)
                    return 0;
                else if(i==0){
                    if(obstacleGrid[i][k] == 0)
                        path[i][k] = path[i][k-1];
                    if(obstacleGrid[i][k] == 1)
                        path[i][k] = 0;
                }else if(k==0){
                    if(obstacleGrid[i][k] == 0)
                        path[i][k] = path[i-1][k];
                    if(obstacleGrid[i][k] == 1)
                        path[i][k] = 0;
                }else{
                    if(obstacleGrid[i][k] == 0)
                        path[i][k] = path[i-1][k] + path[i][k-1];
                    if(obstacleGrid[i][k] == 1)
                        path[i][k] = 0;
                }
            }
        }
        return path[obstacleGrid.length-1][obstacleGrid[0].length-1];
        
    }

}
