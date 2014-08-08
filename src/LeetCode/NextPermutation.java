package LeetCode;

public class NextPermutation {

	public static void main(String[] args) {
		NextPermutation n = new NextPermutation();

		int[] input = { 5, 1, 3, 2, 1,1 };
		int[] input2 = { 5, 4, 3, 2, 1 };

		int[] input3 = { 1,2 };
		n.nextPermutation(input3);

	}

	public void nextPermutation(int[] num) {
		int max = -1, index = num.length - 1;
		for (; index >= 0; index--) {
			if (num[index] >= max)
				max = num[index];
			else
				break;
		}
		if(index == -1){
			num = reverse(num, 0);
			return;
		}
		
		int swap = num.length-1;
		for(int i=index+1; i<num.length; i++){
			if(num[index] >= num[i]){
				swap = i-1;
				break;
			}
		}
		int tmp = num[swap];
		num[swap] = num[index];
		num[index] = tmp;
		num = reverse(num, index+1);
		return;
	}

	public int[] reverse(int[] num, int i) {
		int end = num.length-1;
		while(i < end){
			int tmp = num[i];
			num[i] = num[end];
			num[end] = tmp;
			i++;
			end--;
		}
		return num;
		
	}

}
