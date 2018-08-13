package SimpleExamples;



public class ValidVoteAge {
	static void validAge(int age) throws MyException
	{
		
		if(age<18)
		//	throw new ArithmeticException("Not valid age to vote.");
			throw new MyException("Not valid ");
		else
			System.out.println("Age valid to vote");
	}
	public static void main(String args[])
	{	
		try
		{
		int i=12;
		validAge(i);
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}
