class Test {
	protected int x, y;       // classes in the same package can access these members
}

class Main {
	public static void main(String args[]){
		Test t=new Test();

		System.out.println(t.x+" "+t.y);
	}
}
