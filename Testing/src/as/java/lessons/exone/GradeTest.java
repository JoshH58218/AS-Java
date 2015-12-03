package as.java.lessons.exone;

import java.util.*;

public class GradeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter quiz mark 0-100 ");
		int quiz = sc.nextInt();
		System.out.println("Enter mid-term mark 0-100 ");
		int mid = sc.nextInt();
		System.out.println("Enter final mark 0-100 ");
		int finalmark = sc.nextInt();

		int mark = quiz + mid + finalmark;
		int total = 300;

		if (mark > total) {
			System.out.println("Invalid grade");
		} else if (mark >= ((total / 90) * 100)) {
			System.out.println("Grade A");
		} else if (mark >= ((total / 70) * 100)) {
			System.out.println("Grade B");
		} else if (mark >= ((total / 50) * 100)) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade F");

		}

	}

}
