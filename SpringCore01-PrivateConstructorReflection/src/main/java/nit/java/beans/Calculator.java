package nit.java.beans;

public class Calculator {
	private int a;
	private int b;

	private Calculator() {
		System.out.println("Calculator:: Zero Param Private Constructor");
	}

	public void addition(int x, int y) {
		a = x;
		b = y;
		System.out.println("Addition :" + (a + b));
	}

}
