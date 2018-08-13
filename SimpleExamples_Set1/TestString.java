package SimpleExamples;
//string functions
public class TestString {
public static void main(String[] args) {
	String s="Name";
	String s2=new String("Hello");
	System.out.println(s.concat(s2));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.startsWith("N"));
	System.out.println(s.endsWith("e"));
	System.out.println(s.charAt(2));
	System.out.println(s.length());
	System.out.println(s.replace('N','G'));
	System.out.println(s.substring(2));
	System.out.println(s.substring(2,4));
	System.out.println(s);//immutable
	
	//comparisons
	String s1="Hello";
	String s3="Hello";
	String s4=new String("Hello");
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s1.compareTo(s3));
	System.out.println(s1.compareTo(s4));
}
}
