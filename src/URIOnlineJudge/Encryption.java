package URIOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryption {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int num = Integer.parseInt(in.readLine());
		for (int i = 0; i < num; i++) {
			String line = in.readLine();
			String result = "";
			int half = line.length()%2 == 0 ? line.length()/2-1 : line.length()/2;
			for (int k = line.length() - 1; k >= 0; k--) {
				char c = line.charAt(k);
				if (k > half) {
					if(isLetter(c))
						c = (char) (c + 3);
				}
				else{
					if(isLetter(c))
						c = (char) (c + 2);
					else c = (char) (c - 1);
				}
				result += c;
			}

			System.out.println(result);
		}
	}
	
	public static boolean isLetter(char input){
		if(input >= 'A' && input <= 'Z' || input >= 'a' && input <= 'z')
			return true;
		else return false;
	}

}