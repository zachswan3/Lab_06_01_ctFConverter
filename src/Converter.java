import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        //A program that converts an inputted temperature in C and provides the equivalent temperature in F.
        // Hint: Google is your friend! Given C, solve for F.  Again, check for a valid input value and only respond
        // with the F value if you got it, otherwise output an appropriate error msg to the user.  Testing: 3
        // conditions: Bad Input, then test for the known freezing and boiling points.

        double tempC;
        double tempF;
        Scanner scanner = new Scanner(System.in);
        String trash;

        System.out.println("Please enter your temperature in C");

        if (scanner.hasNextDouble()) {
            tempC = scanner.nextDouble();
            tempF = tempC*1.8 + 32;
            System.out.println("Your temperature in F is " + tempF);
        }
        else {
            trash = scanner.nextLine();
            System.out.println("You have entered an invalid number please try again. " + trash);
        }
    }
}
