package javaFullCourse;
public class this_key {
	
	int a;
	this_key(int a){
		this. a=a;
	}
	
	void show()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		this_key r=new this_key(100);
		
		r.show();
	}

}
