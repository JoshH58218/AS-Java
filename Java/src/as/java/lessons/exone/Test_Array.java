package as.java.lessons.exone;

public class Test_Array {
	public static void main(String[] args) {

		double list[] = { 1.9, 2.9, 3.4, 3.5 };
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}
		double total = 0;

		for (int i = 0; i < list.length; i++) {
			total += list[i];
		}

		System.out.println("Total is " + total);
		double max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		System.out.println("Max is " + max);
	}
}
