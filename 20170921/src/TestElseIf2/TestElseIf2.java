package TestElseIf2;

public class TestElseIf2 {
	public static void main(String[] args) {
		int score = 40;
		String hakjum = "";
		if(score>=90&&score<=100) {
			hakjum = "A";
		}else if(score>=80&&score<90){
			hakjum = "B";
		}else if(score>=70&&score<80){
			hakjum = "C";
		}else if(score>=60&&score<70){
			hakjum = "D";
		}else if(score>=00&&score<60){
			hakjum = "F";
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		if(hakjum!="")
		System.out.println("����� ������ "+hakjum+"�Դϴ�.");
		}
}
