package Yahoo;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 8, 1, 3, 6, 6};
		printRepeating(arr);
	}
	
	
	public static void printRepeating(int arr[])
	{
	  int i;
	  for (i = 0; i < arr.length; i++)
	  {
	    if (arr[Math.abs(arr[i])] >= 0)
	      arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	    else
	      System.out.println(Math.abs(arr[i]));
	  }
	}

}
