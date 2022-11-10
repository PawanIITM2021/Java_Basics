package javaFullCourse;

import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {

	public static void main(String[] args) {
		//int a[]= {10,20,30,40,50};
		
		//System.out.println(a[3]);
		int a[] = new int[5];
		System.out.print("Enter Array Elements: ");
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			a[i]= s.nextInt();
			
		}
		
		System.out.print("Array Elements:\n");
		for(int b:a)
		{
			System.out.print(b+" ");
		}
		Arrays.sort(a);
		System.out.print("\nSorted Array Elements:\n");
		for(int b:a)
		{
			System.out.print(b+" ");
		}
		

	}

}
