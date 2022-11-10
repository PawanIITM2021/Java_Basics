package javaFullCourse;
import java.io.*;
public class fileWriter {

	public static void main(String[] args) {
		
		try
		{
			FileWriter f=new FileWriter("C:\\\\Users\\\\91790\\\\Desktop\\\\javaFullCourse\\\\javaFullCourse\\\\src\\\\javaFullCourse\\\\LC.txt");
			try
			{
				f.write("Java Programming is the best Language...!");
			}
			finally
			{
				f.close();
			}
			System.out.println("Successfully Data Wrote in File");
		}
		catch(IOException i)
		{
			System.out.print(i);
		}

	}

}
