import java.util.Scanner;

public class StringExercise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email id: ");
		String email = (scanner.nextLine()).trim();

		if (email.contains("@") && email.contains(".")) {
			int atPosition = email.indexOf('@');
			int dotPosition = email.indexOf('.');
			int lastAtPosition = email.lastIndexOf('@');
			int lastDotPosition = email.lastIndexOf('.');

			System.out.println(atPosition + " " + dotPosition);
			if ((atPosition != lastAtPosition) || (dotPosition != lastDotPosition) || (atPosition < 4)
					|| ((dotPosition - atPosition - 1) < 3) || ((email.length() - dotPosition - 1) < 2))
				System.out.println("Invalid mail id");
			else
				System.out.println("Congrats! It's a valid mail id");
		} else
			System.out.println("Invalid mail id");

	}

}