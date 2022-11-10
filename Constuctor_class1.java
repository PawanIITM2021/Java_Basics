package javaFullCourse;

class Aexa{
	int a; String b; boolean c;
	Aexa(){
		a=100; b="Pawan"; c=true;
	}
	void Disp() {
		System.out.println(a+" "+b+" "+c);
	}	
}

public class Constuctor_class1 {

	public static void main(String[] args) {
		Aexa r=new Aexa();
		r.Disp();
	}

}
