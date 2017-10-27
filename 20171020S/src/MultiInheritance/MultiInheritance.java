package MultiInheritance;

interface Inter1{
	public int a = 100;
	public abstract void method1();
}

interface Inter2{
	public int b = 100;
	public abstract void method2();
}

public class MultiInheritance implements Inter1, Inter2 {
	public void method1() {
		System.out.println("inter1 method");
	}
	public void method2() {
		System.out.println("inter1 method");
	}
	public static void main (String args[]) {
		MultiInheritance obj = new MultiInheritance();
		System.out.println("inter1 a= " + MultiInheritance.a);
		System.out.println("inter2 b= " + MultiInheritance.b);
		obj.method1();
		obj.method2();
	}
}
