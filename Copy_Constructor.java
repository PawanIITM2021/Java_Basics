package javaFullCourse;
class Aq{
	int a; String b;
	Aq()
	{
		a=10; b= "LearnCoading";
		System.out.println(a+" "+b);
	}
	Aq(Aq ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
public class Copy_Constructor {

	public static void main(String[] args) {
		Aq r = new Aq();
		Aq r2 = new Aq(r);
	}

}
