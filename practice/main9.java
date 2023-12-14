// Runtime polymorphism

class Super {
	public void method() {
		System.out.println("Super.method()");
	}
}

class Sub extends Super {
	public void method() {
		System.out.println("Sub.method()");
	}
}

class main9 {
	public static void main(String args[]) {
		Super A = new Sub();  // A refers to object of Sub() type
		A.method();  // calls method() of Sub

		A = new Super();

		A.method(); // calls method() of Super
	}
}
