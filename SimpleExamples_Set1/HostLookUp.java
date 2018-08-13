package SimpleExamples;

import java.net.InetAddress;
import java.util.Scanner;

//IP lookup example: look up IP addresses associated with given host name

public class HostLookUp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Host;
		do{
		System.out.println("Enter host name:");
		Host=sc.nextLine();
		try{
			InetAddress[] address= InetAddress.getAllByName(Host);
			for(InetAddress ip:address)
				System.out.println(ip.toString());
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}while (doAgain());
}
	private static boolean doAgain()
	{
		System.out.println();
		String s;
		while(true)
		{
			System.out.println("Enter Y to continue,and N to stop");
			s=sc.nextLine();
			if(s.equalsIgnoreCase("Y"))
				return true;
				else
					return false;
		}
	}
}


