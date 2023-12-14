// Final classes

final class Super {
	public void greet() {
		System.out.println("Super: \"Hi\"");
	}
}

class Sub {
	public void greet() {
		System.out.println("Sub: \"Hi\"");
	}
}

final class Subsub extends Sub {
	public void greet() {
		System.out.println("Subsub: \"Hi\"");
	}
}

class main10 {
	public static void main(String args[]) {

		Super sup=new Super();

		sup.greet();

		Sub sub = new Sub();
		
		sub.greet();   // of class Sub

		sub = new Subsub();

		sub.greet();   // of class Subsub
	}
}
