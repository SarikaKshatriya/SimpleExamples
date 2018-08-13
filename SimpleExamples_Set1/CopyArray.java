package SimpleExamples;

import java.util.Arrays;

//array functions 
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 43, 23, 67, 87, 98 };
		int[] b = { 43, 23, 67, 87, 98 };
		//copy
		int aCopy[] = Arrays.copyOf(a, 3);
		for (int i = 0; i < aCopy.length; i++)
			System.out.println(aCopy[i]);
		//sort
		Arrays.sort(a);
		System.out.println("Sorted Array:");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		Arrays.sort(a,1,3);
		System.out.println("Sorted:"+Arrays.toString(a));
		//search
		int key=23;
		System.out.println("Search:");
		int found=Arrays.binarySearch(a,key);
		if(found > -1)
			System.out.print("Found");
		else
			System.out.print("Not Found.");
		
		//comparing
		if(Arrays.equals(a,b))
			System.out.println("Array a and b are Equal");
		else
			System.out.println("Array a and b are Not Equal");
	}

}
