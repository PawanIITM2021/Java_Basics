package javaFullCourse;

class Ao
{
	void input()
	{
		System.out.println("Enter Your Name: ");
	}
}

class Bo extends Ao
{
	void Show()
	{
		System.out.println("My Name is Ankit");
	}
}

class Co extends Ao
{
	void Disp()
	{
		System.out.println("My Name is Ankush");
	}
}
public class Heirarchical_Inheritance {

	public static void main(String[] args) {
		Bo r = new Bo();
		Co r2 = new Co();
		
		r.input(); r.Show();
		r2.input(); r2.Disp();

	}

}
