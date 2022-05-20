package Day3_assignments;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary = 15000;
	private double hra = (15000 * 50) / 100;
	private double medical=2300;
	private double pf = (15000 * 12) / 100;
	private double pt = 200;
	private double netSalary;
	private double grossSalary;

	Employee() {

	}

	public Employee(String employeeName, int employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		System.out.println(employeeName + "   " + "  " + employeeId);
	}

	public void data() {
		
		grossSalary = basicSalary + hra + medical;

		netSalary = grossSalary - pf - pt;
		
		System.out.println(grossSalary);
		
		
		System.out.println(netSalary);

	}

	public static void main(String[] args) {

		Employee abc = new Employee("jalindar", 107);

		abc.data();

	}

}
