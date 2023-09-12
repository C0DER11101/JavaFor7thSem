// Parameterized constructors

class Box{
	double width;
	double height;
	double depth;

	Box(double w, double h, double d){
		System.out.println("Constructing Box");

		width=w;
		height=h;
		depth=d;
	}

	double volume(){
		return width*height*depth;
	}
}

class BoxDemo4{
	public static void main(String args[]){
		Box myBox1=new Box(10, 20, 15);
		Box myBox2=new Box(3, 6, 9);

		double vol;
		vol=myBox1.volume();             // get volume of the first box
		System.out.println("Volume is: "+vol);

		vol=myBox2.volume();             // get volume of the second box
		System.out.println("Volume is: "+vol);
	}
}
