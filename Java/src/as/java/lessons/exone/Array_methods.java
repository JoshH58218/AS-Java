package as.java.lessons.exone;

public class Array_methods {
	public static void main(String[] args) {
		int array[] = new int[10];

		printArray(array);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] reverse(int[] list) {
		int result[] = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];

		}
		return result;
	}
}
