package Day3_assignments;

public class Addition2 {
	
//	
//	public int add(int ...args) {
//		
//		int sum=0;
//		for(int x:args) {
//			sum=sum+x;
//		}
//		return sum;
//	}
	public int add(int ...args) {
		
		int sum=0;
		for(int x:args) {
			sum=sum+x;
		}
		return sum;
	}

	public static void main(String[] args) {

		Addition2 ad=new Addition2();
		
		System.out.println(ad.add(1,2,3,4,5));
		//System.out.println(ad.add(null));
		
		System.out.println(ad.add(20,40,30,40,50,60,70));
	}

}
