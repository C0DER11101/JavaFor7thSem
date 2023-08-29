// Write a program that creates a 2d array with int values. The first element should be an array containing 30. The second array 
// should be an array containing 300 and the 500. The third array should be an array containing 3000, 5000 and 5000.

class _2D{
	public static void main(String args[]){

		int twoD[][]=new int[3][];

		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];

		twoD[0][0]=30;

		twoD[1][0]=300;
		twoD[1][1]=500;

		twoD[2][0]=3000;
		twoD[2][1]=5000;
		twoD[2][2]=5000;

		for(int i=0; i<3; i++){
			for(int j=0; j<=i; j++){
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}
	}
}
