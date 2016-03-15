package Amazon;

public class byteGrayCode {

	public static void main(String[] args) {
		byte a = (byte)0x1c;
		byte b = (byte)0x38;
		System.out.println(isByte(a,b));
	}
	
	public static int isByte(byte term1, byte term2){
		byte x = (byte)(term1 ^ term2);
		int total = 0;
//		while(x!=0){
//			x=(byte)(x&x-1);
//			total++;
//		}
		
		while(x!=0){
			if((x&1) == 1) total++;
			x = (byte)(x>>1);
		}
		
		if(total == 1) return 1;
		else return 0;
	}

}
