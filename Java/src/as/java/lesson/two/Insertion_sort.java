package as.java.lesson.two;

public class Insertion_sort {
	public static void main(String[] args) {
		int[] a = { 22, 5, 56, 49, 2 };
		int temp = 0, current = 1;

		for (current = 1; current < a.length; ++current) {
			while (current > 0 && a[current] < a[current - 1]) {
				temp = a[current];
				a[current] = a[current - 1];
				a[current - 1] = temp;
				--current;
			}
		}
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}

}
