package as.java.lessons.exone;

import java.util.*;

public class Calculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String multiply = "*";
		String divide = "/";
		String subtract = "-";
		String add = "+";

		for (;;) {

			System.out.print("Number one = ");
			double a = sc.nextInt();

			System.out.print("Choose an operation ");
			String operation = sc.next();

			System.out.print("Number two = ");
			double b = sc.nextInt();

			System.out.println("The answer is:");
			if (operation.equals(multiply)) {
				System.out.print(a * b);
			} else if (operation.equals(divide)) {
				System.out.print(a / b);
			} else if (operation.equals(subtract)) {
				System.out.print(a - b);
			} else if (operation.equals(add)) {
				System.out.print(a + b);
			}

			System.out.println(" ");
		}
	}

}
