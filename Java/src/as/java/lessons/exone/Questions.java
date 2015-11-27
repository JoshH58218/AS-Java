package as.java.lessons.exone;

public class Questions {
	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		if (s1 == s2)
			System.out.println("s1==s2");
		if (s1 == s3)
			System.out.println("s1==s3");
		if (s2 == s3)
			System.out.println("s2==s3");

		String one = "abc";
		String two = "abc";
		System.out.println("one" + one.hashCode());
		System.out.println("two" + two.toString());

		System.out.println("one" + one.toString());
		System.out.println("two" + two.toString());

	}

}
