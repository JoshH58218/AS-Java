package as.java.lessons.exone;

import java.util.Scanner;

public class charcounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Word = sc.next();
		char search = sc.next().charAt(0);
		int counter = 0;

		for (int i = 0; i < Word.length(); i++) {
			if (Word.charAt(i) == search) {
				counter++;

			}
		}
		if (counter == 1) {
			System.out.println(search + " appears " + counter + " time in "
					+ Word + ".");
		} else
			System.out.println(search + " appears " + counter + " times in "
					+ Word + ".");
	}

}
