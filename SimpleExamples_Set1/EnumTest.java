package SimpleExamples;
//An enumeration of apple varieties. 
enum Apple
{   
	Jonathan(10), GoldenDel(3), RedDel(5), Winesap(8), Cortland(4);
	private int price;
	Apple(int p)
	{
		price=p;
	}
	int getPrice()
	{
		return price;
	}
}


public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Apple ap; 
		 
		    ap = Apple.RedDel; 
		 
		    // Output an enum value.  
		    System.out.println("Type,price and ordinal of appple: " + ap+ " "+ap.getPrice()+" "+ap.ordinal()); 
		   	 
		    ap = Apple.GoldenDel; 
		     // Compare two enum values.  
		    if(ap == Apple.GoldenDel)    
		    	System.out.println("ap contains GoldenDel.\n"); 
		 
		    // Use an enum to control a switch statement.  
		    switch(ap)
		    {
		    case Jonathan:
		    	System.out.println("Jonathan is red."); 
		    	break;
		    case GoldenDel:
		    	System.out.println("Golden Delicious is yellow."); 
		    	break;
		    case RedDel:
		    	System.out.println("Red Delicious is red."); 
		    	break;  
		    case Winesap:
		    	System.out.println("Winesap is red.");
		    	break; 
		    case Cortland: 
		    	System.out.println("Cortland is red.");
		    	break;  
		    }
		 // use values() -returns all values of enum 
		    Apple allapples[] = Apple.values(); 
		    for(Apple a : allapples)
		    	System.out.println(a); 
		    
		    System.out.println(); 
		 
		    // use valueOf()-returns value of corresponding string
		    ap = Apple.valueOf("Winesap");  
		    System.out.println("ap contains " + ap);
	}

}
