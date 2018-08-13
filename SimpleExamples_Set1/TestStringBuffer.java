package SimpleExamples;
//stringbuffer example
public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.append("Java"));
		System.out.println(sb.insert(2,"Java"));
		System.out.println(sb.replace(1,4,"ouse"));
		System.out.println(sb.length());
		System.out.println(sb.delete(2,4));
		System.out.println(sb.reverse());
		System.out.println(sb);
	}

}
