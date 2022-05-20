package Day5_assignments;

public class WageEmployee extends Employee {

	public void computesalary() {

		int daywage = hrs * 8 + rate;

		System.out.println(daywage);
	}

	public static void main(String[] args) {
		WageEmployee we = new WageEmployee();
		System.out.println(we.hrs);
		System.out.println(we.rate);
		we.computesalary();

	}

}
