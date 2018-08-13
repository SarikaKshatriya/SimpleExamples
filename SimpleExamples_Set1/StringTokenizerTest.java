package SimpleExamples;

import java.util.StringTokenizer;
//StringTokenizer example,space is considered as a delimiter
public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s= new StringTokenizer("This is Java Example");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
	}

}
