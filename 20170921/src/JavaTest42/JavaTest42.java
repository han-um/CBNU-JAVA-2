package JavaTest42;

public class JavaTest42 {
// �ڹ������� �������� 4-2���Դϴ�.
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<20; i++) {
			if(i%2==0 || i%3==0) {
				System.out.println("���� "+i+" �� �����Ͽ����ϴ�.");
				continue;
			}
			sum = sum + i;
		}
		System.out.println("2�� 3�� ����� ������ 1~20�� ���� : "+sum);
	}

}
