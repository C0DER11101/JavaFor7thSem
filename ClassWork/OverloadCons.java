class Box{
	double width;
	double height;
	double depth;
	
	Box(){
		System.out.println("Default constructor called!");
		width=height=depth=0.0;
	}

	Box(double w, double h, double d){
		System.out.println("Parameterized constructor called!");
		width=w;
		height=h;
		depth=d;
	}

	Box(double dimensions){
		System.out.println("Single parameter constructor called!");
		width=height=depth=dimensions;
	}

	double volume(){
		return (width*height*depth);
	}
}

class OverloadCons{

	public static void main(String args[]){
		Box myBox1=new Box();
		Box myBox2=new Box(12, 12, 12);
		Box myBox3=new Box(100);

		double vol;

		vol=myBox1.volume();
		System.out.println("Volumen of box-1: "+vol);

		vol=myBox2.volume();
		System.out.println("Volumen of box-2: "+vol);

		vol=myBox3.volume();
		System.out.println("Volumen of box-3: "+vol);
	}
}
