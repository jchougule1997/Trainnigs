package Day5_assignments;

public class SalesPerson extends WageEmployee {

	int basic = 15000;
	int sales = 20000;
	int commision = (20000 * 3) / 100;

	public void computesalary() {
		int salesperson = basic + commision;

		System.out.println("salary of salesperson is  " + salesperson);
	}

	public static void main(String[] args) {

		SalesPerson sp = new SalesPerson();
		System.out.println("salesperson basic salary is  " + sp.basic);

		System.out.println("salesperson commission is  " + sp.commision);
		sp.computesalary();

	}

}
