class Box{
	double width;
	double height;
	double depth;

	Box(){
		System.out.println("Constructing Box");

		width=10;
		height=10;
		depth=10;
	}

	double volume(){
		return width*height*depth;
	}
}

class BoxDemo3{
	public static void main(String args[]){
		Box myBox1=new Box();
		Box myBox2=new Box();

		double vol;
		vol=myBox1.volume();             // get volume of the first box
		System.out.println("Volume is: "+vol);

		vol=myBox2.volume();             // get volume of the second box
		System.out.println("Volume is: "+vol);
	}
}
