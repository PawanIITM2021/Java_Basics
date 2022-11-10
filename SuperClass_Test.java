package javaFullCourse;

class Super_class
{
	int a = 10;
}

class SupCl extends Super_class
{
	int a=20;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}


public class SuperClass_Test {

	public static void main(String[] args) {
		SupCl c=new SupCl();
		c.show();

	}

}
