// convert lowercase string to uppercase string

import java.util.*;

class main12 {
	public static void main(String args[]) {
		int opt;
		Scanner input=new Scanner(System.in);

		String string=new String();

		System.out.println("Enter a string: ");

		string=System.console().readLine();

		System.out.println("Convert the string to:\n[1] Uppercase?\n[2] Lowercase?");

		System.out.print("> ");
		opt=input.nextInt();

		switch(opt) {
			case 1:
				string=string.toUpperCase();
				System.out.println("String in uppercase: "+string);
				break;

			case 2:
				string=string.toLowerCase();
				System.out.println("String in lowercase: "+string);
				break;

			default:
				System.out.println("ERROR!");
		}
	}
}
