package javaFullCourse;
import java.io.*;
public class createFile 
{

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\91790\\Desktop\\javaFullCourse\\javaFullCourse\\src\\javaFullCourse\\LC.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Successfully Create...!");
			}
			else
			{
				System.out.println("File Already Exist..!");
			}
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled...!");
		}
		
	}

}
