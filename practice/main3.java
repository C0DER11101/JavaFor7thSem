class Test {
	final int a=100;
}

class main3 {
	int b=10;

	public static void main(String args[]) {
		main3 m=new main3();

		Test t=new Test();
		System.out.println("a = "+t.a);
		//System.out.println("b = "+b);  // ERROR! To access a variable you must have a class object
		System.out.println("b = "+m.b);
	}
}
