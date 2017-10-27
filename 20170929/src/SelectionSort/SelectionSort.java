package SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int test[] = {20,30,40,50,10};
		int temp=0;
		
		System.out.println(" 정렬 전");
		System.out.println("=====================");
		for(int i = 0; i<test.length;i++) {
			System.out.println((i+1)+"번쨰 : " + test[i]);
		}
		System.out.println("=====================");
		for(int i=0; i<(test.length-1); i++){
			for(int j=i+1; j<test.length; j++) {
				if(test[i]<test[j]) {
					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
		}
		
		System.out.println(" 정렬 후");
		System.out.println("=====================");
		for(int i = 0; i<test.length;i++) {
			System.out.println((i+1)+"번쨰 : " + test[i]);
		}
	}

}
