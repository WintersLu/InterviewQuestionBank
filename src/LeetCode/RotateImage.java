package LeetCode;

public class RotateImage {

	public static void main(String[] args) {

	}

	public void rotate(int[][] matrix) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int size = matrix.length;
        if(size < 2) return;
        
        int shift = 0;
        while(size - shift*2 >= 2){
            for(int i=0; i<size - shift*2 -1; i++){
                int tmp = matrix[shift][shift + i];
                matrix[shift][shift + i] = matrix[size-1-shift - i][shift];
                matrix[size-1-shift-i][shift] = matrix[size-1-shift][size-1-shift-i];
                matrix[size-1-shift][size-1-shift-i] = matrix[shift+i][size-1-shift];
                matrix[shift+i][size-1-shift] = tmp;
            }
            shift++;
        }
    }

}
