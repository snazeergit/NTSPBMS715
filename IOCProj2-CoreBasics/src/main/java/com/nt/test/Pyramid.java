package com.nt.test;

public class Pyramid {
static Pyramid p;
	public static void main(String[] args) {
		p=new Pyramid();
		//p.print_L_Pyramid(5);
		p.print_R_Pyramid(5);
	}

	void print_L_Pyramid(int number) {

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* \t");
			}
			System.out.println();
			System.out.println();

		}
	}

	void print_R_Pyramid(int number) {

		for (int i = 1; i <= number; i++) {
			for (int j = number; j <= number; j--) {
				System.out.print("* \t");
			}
			System.out.println();
			System.out.println();

		}
	}

}
