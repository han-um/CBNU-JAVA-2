package TestIfElse;

public class TestIfElse {

	public static void main(String[] args) {
		int jumsu = 40;
		String ispassed = "";
		if(jumsu >= 60) {
			ispassed = "합격";
		}
		else {
			ispassed = "불합격";
		}
		System.out.println("당신은 "+ispassed+"입니다.");
		System.out.println("당신의 점수는"+jumsu+"입니다.");
	}

}
