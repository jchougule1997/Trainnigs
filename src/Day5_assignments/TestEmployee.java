package Day5_assignments;

public class TestEmployee extends Employee{
	
	public void computesalary() {
		int a[]= {daywage,salesperson,grosssalary }; 
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
    
		
		TestEmployee te=new TestEmployee();
		te.computesalary();
		
		
	}

}
