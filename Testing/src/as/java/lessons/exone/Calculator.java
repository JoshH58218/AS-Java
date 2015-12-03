package as.java.lessons.exone;

public class Calculator {

	public static void main(String[] args) {
		int numOne, numTwo;

		numOne = Integer.parseInt(args[0]);
		numTwo = Integer.parseInt(args[1]);

		int sum = numOne + numTwo;
		int product = numOne * numTwo;
		int divide = numOne / numTwo;
		int subtract = numOne - numTwo;

		System.out.println("The Sum is: " + sum);
		System.out.println("The Product is: " + product);
		System.out.println("The Division is: " + divide);
		System.out.println("The Subtraction is: " + subtract);

	}

}
