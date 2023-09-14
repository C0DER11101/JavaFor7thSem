class OverloadDemo{
	void test(){
		System.out.println("No parameters");
	}

	void test(int a, int b){
		System.out.println("a = "+a+" b = "+b);
	}

	double test(double a){
		System.out.println("a = "+a);
		return a*a;
	}
}

class Overload2{
	public static void main(String args[]){
		OverloadDemo ob=new OverloadDemo();

		double result;

		ob.test();
		ob.test(10);
		ob.test(10,20);

		result=ob.test(88);
		System.out.println("Result of ob.test(123.25): "+result);

		result=ob.test(123.25);
		System.out.println("Result of ob.test(123.25): "+result);
	}
}
