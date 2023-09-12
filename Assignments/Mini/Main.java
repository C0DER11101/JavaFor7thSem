/* write a program in Java which describes a class student using default and parameterized constructors. It should have instance variables to record the id, name and age of a student. Create two student objects and display their details.*/

class student{
	String id;
	String name;
	int age;

	student(){
		System.out.println("Default constructor called!");
		id="noId";
		name="noName";
		age=0;
	}

	student(String id, String name, int age){
		System.out.println("Parameterized constructor called!\n\n");
		this.id=id;
		this.name=name;
		this.age=age;
	}

	void details(){
		System.out.print("Name: "+this.name+"\n");
		System.out.print("Student id: "+this.id+"\n");
		System.out.print("Age: "+this.age+"\n");
	}
}

class Main{

	public static void main(String args[]){
		student stu1=new student();
		student stu2=new student("CSE-12/20", "Rahul", 21);

		System.out.println("Student-1 details");
		for(int i=0; i<10; i++) System.out.print("-");
		System.out.println();
		stu1.details();
		System.out.println();

		System.out.println("Student-2 details");
		for(int i=0; i<10; i++) System.out.print("-");
		System.out.println();
		stu2.details();
	}
}
