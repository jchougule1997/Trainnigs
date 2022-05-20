package Day4_assignments;

public class employeeData {

	int employeeId;
	String employeeName;
	int dob;

	public employeeData(String name, int id, int d) {
		employeeId = id;

		employeeName = name;
		dob = d;

		System.out.println(employeeName + "   " + employeeId + "  " + dob);

	}

	public static void main(String[] args) {

		employeeData emp = new employeeData("naveen", 100, 1997);

		employeeData emp1 = new employeeData("tom", 101, 1998);

		employeeData emp2 = new employeeData("peter", 102, 2000);



	}

}
