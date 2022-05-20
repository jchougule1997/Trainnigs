package Day3_assignments;

public class ArraysAdd {

	public static void main(String[] args) {

		int a[]= {10,20,30};
		int a1=a.length;
		int b[]= {10,20,30,40};
		
		int b1=b.length;
		
		int sum=a1+b1;
		int c[]=new int[sum];
		
		for(int i=6;i>=sum-1;i--) {
			 c[i]=a[2]+b[3];
			System.out.print(c[i]);

			 
		}
		
	}

}
