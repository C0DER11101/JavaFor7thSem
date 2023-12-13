class main5 {
	public static void main(String args[]) {
		String input=new String();

		int a;

		System.out.print("Enter an integer: ");

		input=System.console().readLine();

		a=Integer.parseInt(input);

		System.out.println("a = "+a);
	}
}
