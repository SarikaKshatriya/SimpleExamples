package SimpleExamples;

import java.util.Enumeration;
import java.util.Vector;
//access objects one by one
public class EnumCursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		for(int i=0;i<=10;i++)
				v.addElement(i);
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer in=(Integer)e.nextElement();
			System.out.println(in);
		}
		
	}

}
