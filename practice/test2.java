class test2 {
	public static void main(String args[]) {

		String str1=new String("hello");

		String str2=str1;  // two variables referencing the same string object

		System.out.println("str1 = "+str1+"\nstr2 = "+str2);

		//str2="java";
		str2=str2.toUpperCase();  // this creates a new string with uppercase value and gets stored in str2 but str1 is unaffected because strings are immutable in Java.

		System.out.println("str1 = "+str1+"\nstr2 = "+str2);
	}
}
