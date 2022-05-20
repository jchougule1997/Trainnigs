package Day4_assignments;

public class splitString {

	public static void main(String[] args) {

		
		
		String name ="abc 123 gmail";
		
		String b []=name.split(" ");
	for(int i=0;i<name.length()-1;i++) {
			System.out.println(b[i]);
		}
		
		String name1="abc-123-gmail";
		String c[]=name1.split("-");
		for(int i=0;i<name1.length()-1;i++) {
			System.out.println(c[i]);
		}
	}

}
