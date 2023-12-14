class Test {
	int a;
}

class test {
	Test Var;   // stores null
}

class main13 {
	static Test Varb;  // stores null and static is used because if it's not used then we will have to access Varb via an object of main13
	public static void main(String args[]) {
		test t=new test();

		test t2=new test();

		System.out.println(t.Var);
		System.out.println(t2);

		System.out.println(Varb);
	}
}
