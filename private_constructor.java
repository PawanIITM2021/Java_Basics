package javaFullCourse;

class private_constructor{
	int a; double b; String c;
	private private_constructor()
	{
		a=10; b=30.56; c="Pawan";
		System.out.println(a+" "+b+" "+c);
	} 
	

	public static void main(String[] args) {
		private_constructor pvr = new private_constructor();

	}

	
}

