package Day4_assignments;

public class StringDemos {

	public static void main(String[] args) {

		String s  ="abc";
		String s1 ="abc";

		String s2 = new String("abc");
		String s3 = new String("abc");

		System.out.println(s.equals(s1));

		System.out.println(s==s1);

		System.out.println(s2.equals(s3));

		System.out.println(s2==s3);
	}

}
