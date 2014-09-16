package Hackranker;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _num;
		_num = in.nextInt();

		for (int k = 0; k < _num; k++) {
			String whole = in.next();
			if (whole.length() % 2 == 1) {
				System.out.println("-1");
				continue;
			}

			int mid = whole.length() / 2, result = 0;
			int[] charset = new int[26];
			for (int i = 0; i < mid; i++) {
				charset[whole.charAt(i) - 'a']++;
			}
			for (int i = mid; i < whole.length(); i++) {
				charset[whole.charAt(i) - 'a']--;
			}
			for (int i = 0; i < 26; i++) {
				result += Math.abs(charset[i]);
			}
			System.out.println(result / 2);
		}
	}

}
