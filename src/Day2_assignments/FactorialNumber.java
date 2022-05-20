package Day2_assignments;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");

		int no = sc.nextInt();
		// int no=5;
		int fact = 1;

		for (int i = 1; i <= no; i++) {

			fact = fact * i;

		}
		System.out.println("factorial of    " + no + "  is  " + fact); // 120
	}

}
