package as.java.lessons.exone;

import java.util.Scanner;

public class Prime_list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(), count = 0;

		for (int n = 0; count < x; n++) {
			if (n == 2) {
				System.out.println(n);
				count++;
			} else if (n == 1) {
				System.out.print("");
			} else if (n % 2 == 0) {
				System.out.print("");
			} else if (n == 3) {
				System.out.println(n);
				count++;
			} else if (n % 3 == 0) {
				System.out.print("");
			} else
				for (int i = 3; i * i <= n; i += 2) {
					if (n % i != 0) {
						count++;
					}
					System.out.println(n);

					break;

				}
		}

	}

}
