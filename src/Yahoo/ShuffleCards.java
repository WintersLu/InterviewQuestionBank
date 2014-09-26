package Yahoo;

import java.util.Random;

public class ShuffleCards {

	public static void main(String[] args) {
		for(int i=0; i<100; i++){
			System.out.println(new Random().nextInt(52));
		}

	}
	
	
	
	private static int[] shuffleCards(int[] cards){
		for(int i=0; i<52; i++){
			int rand = new Random().nextInt(52-i)+i;
			int temp = cards[i];
			cards[i] = cards[rand];
			cards[rand] = temp;
		}
		return cards;
	}

}
