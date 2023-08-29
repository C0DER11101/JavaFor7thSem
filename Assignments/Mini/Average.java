// Write a program that creates and initializes a four-element int array. Calculate and display the average of its values.

class Average{
	public static void main(String args[]){
		int array[]={12, 14, 16, 18};

		System.out.println("Array elements: ");

		for(int i=0; i<4; i++)
			System.out.print(array[i]+" ");

		System.out.println();

		System.out.println("Enter elements into the array: ");

		int avg=0;

		for(int i=0; i<4; i++)
			avg+=array[i];

		System.out.println("Average of the array elements is: "+avg/4);
	}
}
