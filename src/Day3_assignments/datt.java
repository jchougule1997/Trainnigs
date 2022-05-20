package Day3_assignments;



public class datt {
	String employeeName;
	int employeeId;
	int DOB;

	public datt(String name,int id, int d) {
		employeeId = id;
		employeeName = name;
		DOB = d;
System.out.println(employeeId+ "   " + employeeName+"  "+DOB);
	}


	
	public static void main(String[] args) {

		datt emp = new datt("naveen",100, 1997);

		datt emp1 = new datt("tom", 101, 1998);

		datt emp2 = new datt("peter",102, 2000);

		//System.out.println();

//		System.out.println(emp1);
//
//		System.out.println(emp2);
//		
	}

}
