/*
write a java program for the following tasks:

	(a) Prompt the user to enter age and 
	(b) move the cursor to the beginning of the next line(newline).

*/

import java.util.*;

class userDetails{
	int age;

	userDetails(){
		System.out.println("User created!!");
		age=0;
	}

	void getAge(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter age: ");
		age=input.nextInt();
	}
}

class Problem{
	public static void main(String args[]){
		userDetails user=new userDetails();

		user.getAge();
	}
}
