package javaFullCourse;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int a,b,c, ch;
		System.out.println("Enter any Two Numbers: ");
		Scanner s = new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter Your Choice: 1, 2, 3, 4, 5 ");
		ch = s.nextInt();
		
		switch(ch)
		{
			case 1: c=a+b;
				System.out.print("Addition "+c);
				break;
			case 2 : c = a - b;
			System.out.print("Subtraction "+c);
				break;
			case 3: c = a*b;
			System.out.print("Multiplication "+c);
				break;
			case 4: c=a/b;
			System.out.print("Division "+ c);
				break;
			case 5:c=a%b;
			System.out.print("Remainder "+ c);
				break;
				
			default:System.out.print("Invalid Choice....");
			
			
			
			
		
		}

	}

}
