package JavaTest44;

public class JavaTest44 {

	public static void main(String[] args) {
		int sgn = 1;
		int sum = 0;
		int i=0;
		for(i=0; sum<100; i++) {
			sum = sum + (sgn*i);
			System.out.print("+"+sgn*i);

			sgn = sgn *(-1);
		}

		System.out.println("");
		System.out.println("100이 넘을때의 항의 개수는 : "+i);
	}

}
