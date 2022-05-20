package Day3_assignments;

import java.util.Scanner;

public class Account {

	int amt = 0;

	public void diposite(int amt) {

		this.amt = amt + this.amt;

	}

	public void withdraw(int amt) {

		if (amt < this.amt) {
			this.amt = this.amt - amt;
		} else {
			System.out.println("insufficeint balance");
		}
	}

	public static void main(String[] args) {
		Account ac = new Account();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The deposite Number");

		int amt = sc.nextInt();

		ac.diposite(amt);
		System.out.println("available balance is: ");
		System.out.println(ac.amt);
		System.out.println("enter the withdrawel number");
		int b = sc.nextInt();
		ac.withdraw(b);
		System.out.println("available balance is: ");
		System.out.println(ac.amt);

		System.out.println("enter the withdrawel number");
		int d = sc.nextInt();
		ac.withdraw(d);
	}

}
