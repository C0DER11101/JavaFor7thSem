class conversion{

	public static void main(String args[]){
		byte b;
		int i=257;
		double d=232.142;

		System.out.println("Conversion of int to byte");

		b=(byte)i; // typecasting i temporarily to byte so that it can be stored in b

		System.out.println("i and b "+i+" "+b);

		System.out.println("Conversion of double to int");
		i=(int)d; // typecasting d temporarily to int so that it can be stored in i

		System.out.println("d and i "+d+" "+i);

		System.out.println("Conversion of double to byte");
		b=(byte)d;
		System.out.println("d and b "+d+" "+b);
	}
}
