package Yahoo;

public class SubstringImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substring("1234567890", 3, 5));
		String input = "1234567890";
		System.out.println(input.substring(3, 5));
		
	}
	
	public static String substring(String input, int beginIndex){
		StringBuilder sb = new StringBuilder();
		if(beginIndex < 0) return null;
		for(int i=beginIndex; i<input.length(); i++){
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	
	public static String substring(String input, int beginIndex, int endIndex){
		StringBuilder sb = new StringBuilder();
		if(beginIndex < 0) return null;
		for(int i=beginIndex; i<input.length() && i<endIndex; i++){
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}

}
