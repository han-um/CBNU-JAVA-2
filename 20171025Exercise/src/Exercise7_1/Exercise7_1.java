package Exercise7_1;

import java.util.Random;

class SutdaDeck {
final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		int randInt;
		Random rand = new Random();
		for(int i = 0; i < this.CARD_NUM; i++) {
			randInt = 1 + rand.nextInt(10);
			if(randInt == 1|| randInt== 3||randInt==8) {
				this.cards[i] = new SutdaCard(randInt,true);
				}else {
				this.cards[i] = new SutdaCard(randInt,false);
				}
			}
		}
		/*
	(1) 배열 SutdaCard를 적절히 초기화 하시오.
		 */
}
	

class SutdaCard { 
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
// info()대신 Object클래스의 toString()을 오버라이딩했다.
public String toString() {
	return num + ( isKwang ? "K":"");
	}
}


public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++) 
			System.out.print(deck.cards[i]+",");
	}

}
