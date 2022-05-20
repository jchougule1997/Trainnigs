package Day2_assignments;

public class ReverseNumber {

	public static void main(String[] args) {

		
		
		int no=98765432;
		int rev=0, rem;
		while(no!=0) {
			rem=no%10;
			
			rev=rev*10+rem;
			
			no=no/10;
		}
		System.out.println("the number is  "+rev);
	}

}
