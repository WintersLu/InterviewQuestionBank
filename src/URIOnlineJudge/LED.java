package URIOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LED {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int num = Integer.parseInt(in.readLine());
		int[] led = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		
		for (int i = 0; i < num; i++) {
			String input = in.readLine();
			int result= 0;
			for(int k=0; k<input.length(); k++){
				result += led[input.charAt(k) - '0'];
			}
			System.out.println("" + result + " leds");
		}
	}
}
