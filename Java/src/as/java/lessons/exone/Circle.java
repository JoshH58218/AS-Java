package as.java.lessons.exone;

public class Circle {
	public static void main(String[] args) {

		int radius;
		radius = Integer.parseInt(args[0]);

		double area = (Math.PI * radius * radius);

		System.out.println("The area is: " + area);

	}

}
