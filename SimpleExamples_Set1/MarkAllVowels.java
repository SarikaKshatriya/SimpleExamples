package SimpleExamples;

import java.util.Scanner;

//count all vowels and mark with *
public class MarkAllVowels {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String");
	String s=sc.nextLine();
	String previous=s;
	int count=0;
	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if((c=='A'||c=='a')||
			(c=='E'||c=='e')||
			(c=='I'||c=='i')||
			(c=='O'||c=='o')||
			(c=='U'||c=='u'))
			{
				String front=s.substring(0,i);
				String back=s.substring(i+1);
				s=front+"*"+back;
								count++;
			}		
	}
	System.out.println("Original String:"+previous);
	System.out.println("Number of Vowels:"+count);
	System.out.println("Marking with *:"+s);
}
}
