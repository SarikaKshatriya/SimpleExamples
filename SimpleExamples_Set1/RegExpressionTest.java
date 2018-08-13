package SimpleExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionTest {
	static String s,r;
	static Pattern pattern;
	static Matcher matcher;
	static boolean match,validRegex,doneMatching;
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do
		{
			do
			{
			System.out.println("Enter regex:");
			r=sc.nextLine();
			validRegex=true;
			try
			{
				pattern=Pattern.compile(r);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				validRegex=false;
			}
			
		}while(!validRegex);
		doneMatching=false;
		while(!doneMatching)
		{
			System.out.println("Enter String:");
			s=sc.nextLine();
			if(s.length()==0)
				doneMatching=true;
			else
			{
				matcher=pattern.matcher(s);
				if(matcher.matches())
					System.out.println("Matches");
				else
					System.out.println("Doesn't Match");
			}
			
		}
		
	}while(askAgain());
	}
		private static boolean askAgain()
		{
			System.out.println("Wanna do again(Y/N)?");
			String reply=sc.nextLine();
			if(reply.equalsIgnoreCase("Y"))
					return true;
			return false;
					
		}

}
