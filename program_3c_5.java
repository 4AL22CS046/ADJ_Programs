package lab_3;
import java.util.Scanner;
public class program_3c_5 {

   // User-defined function to count words in a string
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;

	        // Split the string using one or more whitespace characters
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Call user-defined function
	        int wordCount = countWords(input);

	        // Display result
	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	    }
	}

