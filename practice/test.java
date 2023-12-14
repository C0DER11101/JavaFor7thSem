class test {
	public static void main(String args[]) {
		String obj=new String("hello");
		String obj1=" world";
		
		String obj2=obj;  // two variables now refer to one memory location

		obj2=" world";  // creates a new string " world" and obj2 refers to that now; obj remains unchanged because strings are immutable in Java.

		System.out.println(obj+" "+obj2); // hello world
	}
}
