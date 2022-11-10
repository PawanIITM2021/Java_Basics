package javaFullCourse;

public class operator_2 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		
		// Logical operator
		
		System.out.println(!(a>b));
		System.out.println(a==b || a!=b);
		System.out.println(a==b && a!=b);
		
		a += 10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		int c = 12, d=23, e=35;
		int r = (c>d)?(c>e?c:e):(d>e?d:e);
		System.out.print(r);
		
		

	}

}
