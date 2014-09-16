package URIOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContractRevision {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String[] input;

		while (true) {
			input = in.readLine().split(" ");
			if(input[0].equals("0") && input[1].equals("0"))
				break;
			
			String result = "";
			boolean first = true;
			for (int i = 0; i < input[1].length(); i++) {
				if (input[0].charAt(0) == input[1].charAt(i)) {
					continue;
				}
				if (input[1].charAt(i) == '0' && first)
					continue;
				first = false;
				result += input[1].charAt(i);
			}
			if (result == "")
				result = "0";
			System.out.println(result);
		}
	}
}
