package as.java.lessons.exone;

import java.util.Scanner;

public class Prime_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 2) {
			System.out.println("Prime");
		} else if (n == 1) {
			System.out.println("Not Prime");
		} else if (n % 2 == 0) {
			System.out.println("Not Prime");
		} else if (n == 3) {
			System.out.println("Prime");
		} else if (n % 3 == 0) {
			System.out.println("Not Prime");
		} else
			for (int i = 3; i * i <= n; i += 2) {
				if (n % i != 0) {
					System.out.println("Prime");
					break;

				}
			}

	}

}
