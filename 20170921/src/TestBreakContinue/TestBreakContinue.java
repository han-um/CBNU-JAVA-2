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
		System.out.println("break �� ��� : " + sum);
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println("continue �� ��� : " + sum);
		// �� ��� 2�� ����� ������ ���� ������ ���´�.
	}
}
