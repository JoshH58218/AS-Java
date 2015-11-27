package as.java.lessons.exone;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];

		for (int row = 0; row < 10; row++) {
			System.out.println("input number " + row);
			array[row] = sc.nextInt();
		}
		System.out.print("The array is: ");
		for (int out = 0; out < 10; out++) {
			System.out.print(array[out] + " ");
		}

	}
}
