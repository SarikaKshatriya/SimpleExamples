package SimpleExamples;

import java.util.Comparator;
import java.util.TreeSet;
//default gives ascending sorting order
//customized gives descending sorting order
public class MyComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t= new TreeSet(new MyComp());
		t.add(10);
		t.add(50);
		t.add(60);
		t.add(20);
		System.out.println(t);
		
	}
	}
	class MyComp implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Integer i1=(Integer)o1;
			Integer i2=(Integer)o2;
			if(i1<i2)
				return +1;
			else if(i1>i2)
				return -1;
			else
				return 0;
		}
	}


