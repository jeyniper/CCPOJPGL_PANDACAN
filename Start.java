import java.util.Scanner;

public class Start {
	public static void main(String[] args) throws Exception {

		String[] name = { "The Pragmatic Programmer", "A Handbook of Agile Software Craftsmanship.",
				"Introduction to Algorithms" };
		String[] author = { "Andrew Hunt", "Robert C. Martin", "Thomas H. Cormen" };
		int[] copy = { 2, 3, 4 };

		System.out.println("ELECTRONIC E-BOOK RENTAL SYSTEM");
		System.out.println("*****************************");
		System.out.println("List of Available Books : ");
		for (int x = 0; x < name.length; x++) {

			System.out.print(x);
			System.out.print(" " + name[x] + " by " + author[x]);
			System.out.println();

		}

		// Declaring Scanner
		Scanner sc = new Scanner(System.in);
		boolean end = false;

		while (end == false) {
			System.out.println("*****************************");
			System.out.println("PLEASE CHOOSE A NUMBER TO RENT A BOOK......");
			int choice = sc.nextInt();
			try {
				if (copy[choice] > 0) {
					System.out.println("YOU RENTED : " + name[choice] + " by " + author[choice]);
					copy[choice] -= 1;
				} else {
					System.out.println("NO COPIES AVAILABLE");
				}
				System.out.println("RENT AGAIN ? YES or NO");
				String c = sc.next();
				if (!c.equals("YES")) {
					end = true;

				}
			} catch (IndexOutOfBoundsException ex) {
				System.err.println("INVALID CHOICE!");
			}
		}
		// END THE PROGRAM
		System.out.println("PROGRAM END");
	}
}
