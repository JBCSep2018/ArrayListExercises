import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare an array list of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("yellow");
        colors.add("Red");

        Scanner in = new Scanner(System.in);

        // Get the color at index 1
        System.out.println("The value at index 1 is: " + colors.get(1));

        // Prompt the user for a color
        // Add that color to the list
        String s = "";
        do {
            System.out.println("Enter a color: ");
            s = in.nextLine();
            System.out.println(s);

            // Only add the color if the user did not enter "Q"
            if (!s.equalsIgnoreCase("Q")) {
                colors.add(s);
            }
        } while (!s.equalsIgnoreCase("Q"));
        System.out.println(s);

// Print out list of colors
        for (String x : colors) {
            System.out.println(x);
        }
    }
}