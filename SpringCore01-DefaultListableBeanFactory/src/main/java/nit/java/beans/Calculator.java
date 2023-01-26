package nit.java.beans;

public class Calculator {
	private int a;
	private int b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int addition(int x, int y) {
		a = a + x;
		b = b + y;
		return (a + b);
	}

}
