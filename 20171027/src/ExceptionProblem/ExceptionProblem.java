package ExceptionProblem;

public class ExceptionProblem {

	public static void main(String[] args) {
		int ar[] = {10,20,30};
		
		try {
				for(int i=0; i<ar.length+1; i++) {
					System.out.println("ar["+i+"]:"+ar[i]);
				}
		}
		catch(Exception e){
			System.out.println("예외 발생.");
		}
		finally {
			System.out.println("==================================");
			System.out.println("프로그램 정상 종료");
		}
	}

}
