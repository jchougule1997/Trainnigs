package Day5_assignments;

public abstract class Employee {

	
	int hrs=430;
	int rate=800;
	int daywage = hrs * 8 + rate;
	int basic = 15000;
	int sales = 20000;
	int commision = (20000 * 3) / 100;
	int salesperson = basic + commision;
	static int fixedsalary = 50000;
	static int incentives = 12000;
	int grosssalary = fixedsalary + incentives;



	public abstract void computesalary();
}
