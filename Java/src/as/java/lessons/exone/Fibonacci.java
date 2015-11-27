package as.java.lessons.exone;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 1, n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x += y;
			y = x - y;
			System.out.println(x);

		}
	}

}
