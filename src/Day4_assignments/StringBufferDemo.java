package Day4_assignments;

public class StringBufferDemo {

	public static void main(String[] args) {

		
		
		StringBuffer sb=new StringBuffer("welcome java");
		StringBuffer sb1=new StringBuffer("welcome java");
		
		System.out.println(sb1.equals(sb));
		
		System.out.println(sb.append('a'));
		
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());         //16+12=28
		
		System.out.println(sb.deleteCharAt(12));
		
		
		System.out.println(sb.delete(0, 10));
		
		
	}

}
