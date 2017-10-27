package EX2;

public class EX2 {

	public static void main(String[] args) {
		int coinUnit[] = {500,100,50,10};
		int money = 2630;
		
		int num = 0;
		System.out.println("금액 : " + money);
		System.out.println("=======================");
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원  동전 : " + (money/coinUnit[i]) + "개");
			money = money % coinUnit[i];
		}
	}

}
