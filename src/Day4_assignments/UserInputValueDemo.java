package Day4_assignments;

import java.util.Scanner;

public class UserInputValueDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value"); // 27

		int a = sc.nextInt();

		System.out.println(Integer.toBinaryString(a)); // 11011

		System.out.println(Integer.toHexString(a)); // 1b

		System.out.println(Integer.toOctalString(a)); // 33

		System.out.println(Integer.toString(a)); // 27
	}

}
