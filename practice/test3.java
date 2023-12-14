class test3 {
	public static void main(String args[]) {
		System.out.println("main()");
		test3 t=new test3(n);
	}

	static int a=10;
	static int n;
	int b=5;
	int c;

	public test3(int m) {
		System.out.println("Constructor: ");
		System.out.println(a+","+b+","+c+","+n+","+m);
	}

	{
		System.out.println("In simple block");
		b=30;
		n=20;
	}

	static{
		System.out.println("In static simple block");
		a=60;
	}
}
