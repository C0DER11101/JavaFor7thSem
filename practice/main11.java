// Program to search a number in an array
import java.util.*;

class main11 {
	private int search(int array[], int num) {
		for(int i=0; i<array.length; i++) {
			if(array[i]==num)
				return i;
		}

		return -1;
	}

	public static void main(String args[]) {
		main11 obj=new main11();

		Scanner input=new Scanner(System.in);

		int array[]={10, 45, 20, 55, 100, 60};

		int target;

		System.out.print("Enter number to be searched: ");
		target=input.nextInt();

		int index=obj.search(array, target);

		if(index>=0)
			System.out.println(target+" is at index "+index+" and position "+(index+1));

		else
			System.out.println(target+" is not in the array!");
	}
}
