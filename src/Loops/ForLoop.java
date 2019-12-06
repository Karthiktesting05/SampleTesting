package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For loop : This executes a piece of code/statement for a particular
		// number of times
		/*
		 * > = Greaterthan < = Lessthan
		 */

		for (int i = 0; i < 500; i++) {

			System.out.println("MY NAME IS VENKAT");

			if (i == 2) {
				break;
			}

		}

		int Count = 50;

		for (int i = 0; i <= Count; i++) {

			// System.out.println(i);

			if (i % 2 == 0) {

				System.out.println(i + ":  Value is Even Number");
			}

			else if (i % 2 != 0) {

				System.out.println(i + ":  Value is Odd Number");

			}
		}
	}
}
