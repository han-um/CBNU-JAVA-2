package TestSwitch;

import java.util.*;
public class TestSwitch {

	public static void main(String[] args) {
		int score = 0;
		String grade = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
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
		System.out.print("�߸��� �����Դϴ�. ");
		if(grade!="")
		System.out.println("����� ������ "+grade+"�Դϴ�.");
		

	}

}
