package javaFullCourse;
import java.util.Scanner;

public class arrayClass2 {

	public static void main(String[] args) {
		
		//int a[]= {10,20,30,40,50}:   //a[5];
		int a[][] = new int[2][2];
		System.out.print("Enter Array Elements: ");
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.print("\nMatrix Elements:\n");
		for(int i=0; i <2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
