import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string (or an empty string to quit):");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        if (inputs.size() < 5) {
            System.out.println("You entered less than 5 strings.");
        } else {
            System.out.println("The fifth string you entered was: " + inputs.get(4));
        }
    }
}

