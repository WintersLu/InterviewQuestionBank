package LeetCode;

public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int input = 1;
        int size = n;
        int shift = 0;
        while(size - (shift+1) * 2 >= 0){
            for(int i=shift; i<size-1-shift; i++){
                result[shift][i] = input++;
            }
            for(int i=shift; i<size-1-shift; i++){
                result[i][size-1-shift] = input++;
            }
            for(int i=shift; i<size-1-shift; i++){
                result[size-1-shift][size-1-i] = input++;
            }
            for(int i=shift; i<size-1-shift; i++){
                result[size-1-i][shift] = input++;
            }
            shift++;
        }
        if(size- (shift+1)*2 == -1)
            result[shift][shift] = input;
        return result;
    }

}
