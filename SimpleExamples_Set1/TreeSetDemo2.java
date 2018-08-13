package SimpleExamples;

import java.util.Comparator;
import java.util.TreeSet;
//default gives ascending sorting order
//customized gives descending sorting order
public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t= new TreeSet(new MyComparator2());
		t.add("Sara");
		t.add("Andy");
		t.add("George");
		t.add("Kate");
		System.out.println(t);
		
	}
	}
	class MyComparator2 implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			String s1=o1.toString();
			String s2=(String)o2;
			return s2.compareTo(s1);
			//return -s1.compareTo(s2);
			//both gives reverse order output
		}
	}



