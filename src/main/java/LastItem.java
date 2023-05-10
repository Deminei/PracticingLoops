import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

        if (inputs.isEmpty()) {
            System.out.println("You did not enter any strings.");
        } else {
            System.out.println("The last item in the list is: " + inputs.get(inputs.size() - 1));
        }
    }
}

