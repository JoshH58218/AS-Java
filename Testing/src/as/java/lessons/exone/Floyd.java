package as.java.lessons.exone;

import java.util.Scanner;

public class Floyd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 1, y = 0, z = sc.nextInt();

		for (int i = 1; i < z + 1; i++) {
			x++;
			for (int j = 1; j < x; j++) {
				y++;
				System.out.print(y + " ");

			}
			System.out.println();
		}
	}
}
