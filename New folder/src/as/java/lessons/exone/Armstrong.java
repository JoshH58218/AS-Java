package as.java.lessons.exone;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, sum = 0, temp, value, digits = 0;
		n = sc.nextInt();
		temp = n;

		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}
		temp = n;

		while (temp != 0) {
			value = temp % 10;
			sum = sum + power(value, digits);
			temp = temp / 10;
		}
		if (n == sum) {
			System.out.println(n + " is an armstrong number.");
		} else
			System.out.println(n + " is not an armstrong number.");

	}

	static int power(int x, int y) {
		int c, p = 1;

		for (c = 1; c <= y; c++) {
			p = p * x;
		}
		return p;

	}

}
