package CareerCup;

public class MultipleRandomMaxInArray {

	public static void main(String[] args) {
		int array[] = {1,4,9,7,3,9,4,7,2,7,3,0,1,2,9,6,5,7,8,9};
		int maxIndex = 0;
		int count = 0;
		for(int i= 0;i<array.length;i++){
			if(array[maxIndex] == array[i])
				count++;
			else if(array[maxIndex] < array[i]){
				maxIndex = i;
				count = 1;
			}
		}
		int len = array.length;
		int lenSize = 1;
		while( len != 0){
			len = len / 10;
			lenSize = lenSize * 10;
		}
		int r = (int)(Math.random() * lenSize);
		int randomCount = (r%count)+1;
		int j = maxIndex;
		while(randomCount != 0)
			if(array[j++] == array[maxIndex])
				randomCount--;
		System.out.println("The Max Number is " + array[maxIndex] +" and it's random index is " + (j));
	}

}
