// compare two strings

class main12B {
	public static void main(String args[]) {
		String str1=new String();
		String str2=new String();

		java.util.Scanner input=new java.util.Scanner(System.in);

		System.out.print("Enter string 1: ");
		str1=input.nextLine();

		System.out.print("Enter string 2: ");
		str2=input.nextLine();


		if(str2.compareTo(str1)==0)
			System.out.println("Strings are equal!!");
		else
			System.out.println("Strings are not equal!!");
	}
}
