package Yahoo;

public class ReverseWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWordinString(" the  sky is blue"));
	}
	
	
	public static String reverseWordinString(String string){
		int strLeng = string.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += string.charAt(i);
            if((string.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }
        return reverse;
	}

}
