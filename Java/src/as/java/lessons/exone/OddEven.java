package as.java.lessons.exone;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		for (;;) {
			int x = sc.nextInt();

			int r = x % 2;

			if (r == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}

		}
	}

}
