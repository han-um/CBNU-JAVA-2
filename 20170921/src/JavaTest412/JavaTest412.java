package JavaTest412;

public class JavaTest412 {

	public static void main(String[] args) {
		//ㄴㅇㅁㄴ
		int start = 1;
		for(int i=1; start<10; i++) { // 9�ܱ����� ����� �� (Start<10)
			for(int j=start; j<start+3; j++) {  
				System.out.print(j+" * "+i+" = "+i*j+"	");
			}
			System.out.println(""); // ������ 3�� ǥ���� �ٹٲ��ϱ�
			if(i%3==0) {
				start = start+3; 
				System.out.println(""); // �ܹٲ�
				System.out.println("");
				i = 0; // �ܹٲ��� �ٽ� x*1���� ����ϱ� ������ i�� 0(�����ݺ��� ���۽� 1)�� �ʱ�ȭ
			}
		}
	}

}
