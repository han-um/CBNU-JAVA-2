package TestSwitch;

import java.util.*;
public class TestSwitch {

	public static void main(String[] args) {
		int score = 0;
		String grade = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		score = scanner.nextInt();
		scanner.close();
		
		switch (score/10) {
		case 9:
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			
			break;	
		}
		System.out.print("잘못된 점수입니다. ");
		if(grade!="")
		System.out.println("당신의 학점은 "+grade+"입니다.");
		

	}

}
