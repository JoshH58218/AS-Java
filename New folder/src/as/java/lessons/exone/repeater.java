package as.java.lessons.exone;

import java.util.*;

public class repeater {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String sentence = "";

		for (;;) {
			String word = sc.nextLine();
			sentence = (sentence + word + " ");
			System.out.println(sentence);
		}
	}

}
