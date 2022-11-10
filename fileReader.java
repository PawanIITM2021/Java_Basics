package javaFullCourse;
import java.io.*;
public class fileReader {

	public static void main(String[] args) {
		try
		{
			FileReader r = new FileReader("C:\\Users\\91790\\Desktop\\javaFullCourse\\javaFullCourse\\src\\javaFullCourse\\LC.txt");
			try
			{
				int i;
				while((i = r.read())!= -1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				r.close();
			}
		}
		catch(IOException e) 
		{
			System.out.println("Exception Handled.......");
		}

	}

}
