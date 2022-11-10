package javaFullCourse;


interface Amult
{
	void show();
}
interface Bmult
{
	void show();
}
class multiple_Inheritance implements Amult,Bmult
{	public void show()
	{
		System.out.println("Interface A & B");
	
	}
	public static void main(String[] args) {
		multiple_Inheritance m=new multiple_Inheritance();
		m.show();
	}
}


