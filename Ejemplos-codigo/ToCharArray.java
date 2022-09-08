import java.util.Scanner;

public class ToCharArray {
	public static void main(String[] args) {
		String string;
		if (args.length == 0) {
			// System.out.println("Inserte un día de la semana");
			Scanner scanner = new Scanner(System.in);
			string = scanner.nextLine();
		} else {
		string = args[0];
		}

		char[] charArray = text.toCharArray();

		char[] charArray = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			charArray[i] = c;
		}
		for (char c : charArray)
			System.out.println(c);
	}

}
