package as.java.lessons.exone;

import java.util.*;

public class JavaExercises {
	public static void main(String[] args) {

		checkEligibility();
	}

	static void checkEligibility() {

		int age;

		Scanner sc = new Scanner(System.in);
		System.out.print("How old are you? ");
		age = sc.nextInt();

		if (age >= 18)
			System.out.print("Adult");
		else
			System.out.print("Under 18");

	}
}
