package javaFullCourse;

class Aconst{
	int a; String name;
	Aconst()
	{
		a=0; name=null;
	}
	void show()
	{
		System.out.println(a+" "+name);
	}
}

class constructor_class {

	public static void main(String[] args) {
		
		Aconst ref = new Aconst();
		ref.show();

	}

}
