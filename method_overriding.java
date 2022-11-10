package javaFullCourse;

class shape
{
	void draw()
	{
		System.out.println("Can't Say shape Type");
	}
}
class square extends shape
{	@Override
	void draw()
	{   
		super.draw();
		System.out.println("square shape");
	}
}
public class method_overriding {

	public static void main(String[] args) {
		shape r=new square();
		
		r.draw();

	}

}
