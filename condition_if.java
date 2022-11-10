package javaFullCourse;
import java.util.Scanner;
public class condition_if {

	public static void main(String[] args) {
		
		int pwd;
		System.out.print("Enter Password:= ");
		Scanner obj = new Scanner(System.in);
		pwd = obj.nextInt();
		if(pwd == 2731) {
			System.out.println("My Name:= Pawan");
			System.out.println("My Age:= 25");
			System.out.println("My Number:= 790***065");
		}
		else {
			System.out.println("Sorry! Wrong Password...");
		}
	}

}
