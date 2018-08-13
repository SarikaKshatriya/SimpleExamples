package SimpleExamples;

public class MultipleCatch {
	public static void main(String args[])
	{
		int a=5,b=0;
		try
		{
			int c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		}
}
