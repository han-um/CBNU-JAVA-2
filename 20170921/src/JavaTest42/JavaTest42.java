package JavaTest42;

public class JavaTest42 {
// 자바의정석 연습문제 4-2번입니다.
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<20; i++) {
			if(i%2==0 || i%3==0) {
				System.out.println("숫자 "+i+" 를 제외하였습니다.");
				continue;
			}
			sum = sum + i;
		}
		System.out.println("2와 3의 배수를 제외한 1~20의 합은 : "+sum);
	}

}
