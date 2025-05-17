package lab_3;
import java.util.Scanner;
public class program_3b_5 {
	    // User-defined function to remove all whitespace
	    public static String removeWhitespace(String str) {
	        if (str == null) return null;
	        return str.replaceAll("\\s+", "");  // \\s+ matches all whitespace characters
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string with spaces or whitespace: ");
	        String input = scanner.nextLine();

	        // Call user-defined function
	        String noWhitespace = removeWhitespace(input);

	        // Output the result
	        System.out.println("String without whitespace: " + noWhitespace);

	        scanner.close();
	    }
	}

