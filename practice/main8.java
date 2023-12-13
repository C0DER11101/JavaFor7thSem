class main8{
	public static void main(String args[]){
		// labeled loops

loop:
		for(int i=0; i<20; i++) {
			System.out.println("i = "+i);

			if(i==15)
				break;
			else
				continue loop;  // if we hadn't provided this label in the continue statment, the program would still have executed as we would expect it to
		}
	}
}
