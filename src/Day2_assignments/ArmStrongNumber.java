package Day2_assignments;

public class ArmStrongNumber {

	public static void main(String[] args) {

		   int no=153;
		   int t1=no;
		   
		   int len=0;
		   while(t1!=0) {
			 
			         //15    //
			   
			   len=len+1;
			   t1=t1/10; //1
			   }
		   int t2=no;  ;
		   int rem;
		  // int mul=1;
		   int arm=0;
		   while(t2 !=0) {
			   int mul=1;
			   rem=t2%10;
			   
			  // int mul=1;
			   for(int i=1;i<=len;i++) {
				   mul=mul*rem;
			   }
			   arm=arm+mul;
			   t2=t2/10;
		   }
		   if(arm==no) {
			   System.out.println("number is a armstrong number");
			   
		   }else {
			   System.out.println("number is not a armstrong number");
		   }
		
	}

}
