package as.java.lessons.exone;

public class UsingEquals {
	public static void main(String[] args) {

		String longPhrase1 = "Floxinoxinihlipilification";
		String longPhrase2 = "Floxinoxinihlipilification";
		String longPhrase3 = "qwertyuiopasdfghjkl";
		String longPhrase4 = new String("Floxinoxinihlipilification");

		String subStringOne = longPhrase1.substring(4, 8);
		System.out.println(subStringOne);

		String subStringTwo = longPhrase2.substring(15);
		System.out.println(subStringTwo);

		System.out.println(longPhrase1.equals(longPhrase2));

		System.out.println(longPhrase1 == longPhrase2);

		System.out.println(longPhrase1 == longPhrase4);

		System.out.println(longPhrase1 == longPhrase3);

	}

}
