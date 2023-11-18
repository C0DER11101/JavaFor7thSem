class Box {
	float length;
	float breadth;
	float height;

	Box() {
		System.out.println("Default constructor");
		length=breadth=height=0.0f;
	}

	Box(float length, float breadth, float height) {
		System.out.println("Constructor-2: ");
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}

	Box(float length, float height) {
		System.out.println("Constructor-3: ");
		this.length=length;
		this.height=height;
		this.breadth=height;;
	}

	void volume() {
		System.out.println("Volume: "+length*breadth*height);
	}
}

class Main {
	public static void main(String args[]) {
		Box cuboid1=new Box();
		Box cuboid2=new Box(10f, 20f, 30f);
		Box cuboid3=new Box(10f, 50f);

		System.out.println("\nCuboid-1: ");
		cuboid1.volume();
		System.out.println("Cuboid-2: ");
		cuboid2.volume();
		System.out.println("Cuboid-3: ");
		cuboid3.volume();
	}
}
