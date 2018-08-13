package SimpleExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

//Getting a valid Integer
//types of printing exception

public class GetInteger {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter integer:");
		int i= GetAnInteger();
		System.out.println("Entered:"+i);
	}
	public static int GetAnInteger()
	{
		while(true)
		{
			try
			{
				return sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				sc.next();
				//System.out.println(e.getMessage());
				//e.printStackTrace();
				//e.toString();
				//e.getMessage();
				System.out.println(e.toString());
			}
		}
	}
}
