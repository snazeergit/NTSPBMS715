package nit.java.beans;

public class Calculator {
	private int a;
	private int b;

	private Calculator() {
		System.out.println("Calculator:: Zero Param Private Constructor");
	}

	private Calculator(int a, int b) {
		System.out.println("Calculator:: 2-Param Private constructor");
		this.a = a;
		this.b = b;
	}

	public void addition(int x, int y) {
		a = x;
		b = y;
		System.out.println("Addition :" + (a + b));
	}

}
