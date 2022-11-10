package javaFullCourse;
import java.util.Scanner;

abstract class xyzBank
{
	public String Name="myBank";
	public String IFSC="myBank123";
	
	public void bankDetail()
	{
		System.out.println("Bank_Name: "+Name+" "+"Bank_IFSC Code: "+IFSC);
	}
	abstract void Deposite();
	abstract void Withdraw();
	abstract void checkBal();
}

class bankService extends xyzBank
{
	private double bal=5000;
	private int pwd;
	public double money;
	
	public void Deposite()
	{
		System.out.println("Enter Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("Enter Deposite Amount: ");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposited Money: "+money);
			System.out.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
	}
	public void Withdraw()
	{
		System.out.println("Enter Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("Enter Withdraw Amount: ");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdrawn Money: "+money);
			System.out.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
	}
	public void checkBal()
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Total Balance: "+bal);
			
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
	}
}

public class customer_2 {

	public static void main(String[] args) {
		bankService b = new bankService();
		b.bankDetail();
		
		int ch;
		System.out.println("1. Deposite: ");
		System.out.println("2. Withdrawn: ");
		System.out.println("3. checkBalance: ");
		
		System.out.print("\nEnter Your Choice");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		
		switch(ch)
		{
		case 1: b.Deposite();
		break;
		case 2: b.Withdraw();
		break;
		case 3: b.checkBal();
		break;
		default: System.out.println("Invalid Choice: ");
		
		}
		

	}

}
