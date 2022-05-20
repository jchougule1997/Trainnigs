package Day5_assignments;

public class Manager extends Employee {

	static int fixedsalary = 50000;
	static int incentives = 12000;

	public void computesalary() {

		int grosssalary = fixedsalary + incentives;

		System.out.println("salary of manager is  " + grosssalary);
	}

	public static void main(String[] args) {

		Manager mg = new Manager();

		System.out.println("fixed salary of manager is  " + fixedsalary);

		System.out.println("salary of manager with incentives is  ");
		mg.computesalary();

	}

}
