class test3 {
	public static void main(String args[]) {
		test3 t=new test3(n);
	}

	static int a=10;
	static int n;
	int b=5;
	int c;

	public test3(int m) {
		System.out.println(a+","+b+","+c+","+n+","+m);
	}

	{
		b=30;
		n=20;
	}

	static{
		a=60;
	}
}
