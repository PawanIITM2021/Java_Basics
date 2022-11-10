package javaFullCourse;

class Apara{
	int x,y;
	Apara(int a, int b)//parameterized
	{
		x=a; y=b;
	}
	Apara(int a, String b)//parameterized
	{
		System.out.println(a+" "+b);
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
}

public class Parameterized_Constructor {

	public static void main(String[] args) {
		Apara r=new Apara(100,200);
		r.show(); 
		Apara ref = new Apara(10, "ankush");

	}

}
