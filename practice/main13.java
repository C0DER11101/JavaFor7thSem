class Test {
	int a;
}

class test {
	Test Var;   // stores null
}

class main13 {
	Test Varb;  // stores null
	public static void main(String args[]) {
		test t=new test();

		test t2=new test();

		System.out.println(t.Var);
		System.out.println(t2);

		main13 obj=new main13();
		System.out.println(obj.Varb);
	}
}
