package lab_1a;
import java.util.ArrayList;
public class program_1b_1 {
	

	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the ArrayList
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Orange");

	        // Display the colors
	        System.out.println("Available colors: " + colors);

	        // Search for the color "Red"
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}


