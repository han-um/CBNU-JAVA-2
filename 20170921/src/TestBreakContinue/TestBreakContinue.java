package TestBreakContinue;

public class TestBreakContinue {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				break;
			}
			sum = sum + i;
		}
		System.out.println("break 의 경우 : " + sum);
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println("continue 의 경우 : " + sum);
		// 이 경우 2의 배수를 제외한 수의 총합이 나온다.
	}
}
