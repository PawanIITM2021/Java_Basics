package javaFullCourse;

class student
{
	int roll, marks;
	String name;
	void input()
	{
		System.out.println("Enter roll name & marks: ");
	}
}

public class Simple_Inheritance extends student {

	void disp()
	{
		roll=1; name="Pawan"; marks=89;
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		Simple_Inheritance p=new Simple_Inheritance();
		p.input(); p.disp();

	}

}
