package com.nt.test;

class Test<T> {
	// An object of type T is declared
	T obj;

	Test(T obj) {
		this.obj = obj;
	} // constructor

	/*public T getObject() {
		return this.obj;
	}*/
}

//Driver class to test above
class Main {
	public static void main(String[] args) {
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getClass());

		// instance of String type
		Test<String> sObj = new Test<String>("GeeksForGeeks");
		System.out.println(sObj.getClass());
		System.out.println("********************");
	
	}
}
