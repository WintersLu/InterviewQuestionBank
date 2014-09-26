package Yahoo;

public class ImplMultiplyDivide {

	public static void main(String[] args) {
		System.out.println(multiply(6, -2));
		System.out.println(divide(-6, -3));
	}
	
	public static int multiply(int a, int b){
		if(a < b) {
			return multiply(b, a);
		}
		int sum = 0;
		for(int i= Math.abs(b); i>0; i--){
			sum += a;
		}
		if(b<0) {
			sum = negate(sum);
		}
		return sum;
	}
	
	public static int negate(int a){
		int k = 0, i=0;
		do{
			k += a < 0? 1 : -1;
			i += a < 0? -1: 1;
		}while(i!=a);
		a += k + k;
		return a;
	}
	
	public static int divide(int a, int b){
		boolean negative = false;
		if(a<0 && b<0) negative = false;
		else if(a<0||b<0) negative = true;
		a = Math.abs(a);
		b = Math.abs(b);
		
		int prod = 0;
		int result = 0;
		while(prod + b <= a){
			prod += b;
			result++;
		}
		
		if(negative) result = negate(result);
		return result;
		
	}

}
