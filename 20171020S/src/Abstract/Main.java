package Abstract;

public class Main {

	public static void main(String[] args) {
		Terran marine = new Terran();
		marine.attack();
		Protoss dragoon = new Protoss();
		dragoon.attack();
		Zerg hydralisk = new Zerg();
		hydralisk.attack();
		
		System.out.println("===객체 형번환과 오버라이딩을 이용 ===");
		Starcraft obj = new Terran();
		obj.attack();
		obj = new Protoss();
		obj.attack();
		obj = new Zerg();
		obj.attack();
		
	}

}
