class Test {
	static int a;    // class variable
	int b=100;
}
class main4 {
	public static void main(String args[]) {
		Test t1=new Test();

		t1.a=1000;

		Test t2=new Test();

		// all the following three will display 1000
		System.out.println("Test.a = "+Test.a);
		System.out.println("t1.a = "+t1.a);
		System.out.println("t2.a = "+t2.a);

		t2.a=2000;

		// all the following three will display 2000
		System.out.println("Test.a = "+Test.a);
		System.out.println("t1.a = "+t1.a);
		System.out.println("t2.a = "+t2.a);

		/*
		System.out.println("b = "+Test.b);
		System.out.println("b = "+t.b);
		 */
	}
}
