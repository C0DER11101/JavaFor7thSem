import java.util.Scanner;

class main6 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);

		int num;

		String str=new String();

		System.out.print("Enter a number: ");
		num=input.nextInt();

		input.nextLine();   // while entering the number, you press ENTER, the newline character is discarded by nextInt() and it gets accepted in str=input.nextLine(); and so we are not prompted to enter the string and the string actually accepts the newline discarded by nextInt(). So to prevent that this statement has been provided so that it accepts the discarded newline and we are prompted to enter the string.

		System.out.print("Enter a string: ");
		str=input.nextLine();

		System.out.println("num = "+num);
		System.out.println("str = "+str);
	}
}
