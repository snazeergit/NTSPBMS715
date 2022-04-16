package nit.java.beans;

public class Calculator {
	private int a;
	private int b;

	private Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void addition(int x, int y) {
		a = a + x;
		b = b + y;
		System.out.println("Addition :" + (a + b));
	}

}
