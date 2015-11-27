package as.java.lessons.exone;

import java.util.Scanner;

public class Two_number_Input {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int a, b;

		System.out.print("input two numbers ");
		;
		a = keyboard.nextInt();

		b = keyboard.nextInt();

		System.out.print(a + " + " + b + " = " + (a + b));
	}

}
