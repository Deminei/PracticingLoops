import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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

        int sum = getSum(numbers);
        System.out.print("The numbers in the list are:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(" " + numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("The sum of that list is: " + sum);
    }

    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}


