package javaFullCourse;
import java.util.Scanner;
public class dowhile_loop {

	public static void main(String[] args) {
		
		int num;
		System.out.print("Enter any Number: ");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		do
		{
			System.out.print(num+" ");
			++ num;
		}
		while(num<=10);
	}

}
