class test{
	public static void main(String args[]){
		String name=System.console().readLine();
		String name2=System.console().readLine();

		if(name.equals(name2))
			System.out.println("Strings are equal!");

		else
			System.out.println("Unequal");
	}
}
