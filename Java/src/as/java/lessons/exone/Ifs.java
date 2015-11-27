package as.java.lessons.exone;

import java.util.Scanner;

public class Ifs {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Pick a number ");
		int x = keyboard.nextInt();

		if (x < 20) {
			System.out.print("X is less than 20");
		} else if (x == 20) {
			System.out.print("The value of X is 20");
		} else if (x > 20) {
			System.out.print("X is greater than 20");
		}

	}

}
