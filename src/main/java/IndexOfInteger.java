import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Enter an integer (or 0 to quit):");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        if (numbers.isEmpty()) {
            System.out.println("You did not enter any integers.");
        } else {
            System.out.println("Done entering integers into the list");
            System.out.println("What number are you looking for in the list?");
            int searchNumber = scanner.nextInt();
            boolean found = false;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == searchNumber) {
                    if (!found) {
                        System.out.println("The number " + searchNumber + " was found at index " + i + ".");
                        found = true;
                    } else {
                        System.out.println("The number " + searchNumber + " was also found at index " + i + ".");
                    }
                }
            }
            if (!found) {
                System.out.println("The number " + searchNumber + " was not found in the list.");
            }
        }
    }
}



