package as.java.lessons.exone;

public class Case {
	public static void main(String args[]) {
		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Well done");
			break;
		case 'C':
			System.out.println("Not too bad");
			break;
		case 'D':
			System.out.println("You passed");
			break;
		case 'F':
			System.out.println("You failed");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}
}
