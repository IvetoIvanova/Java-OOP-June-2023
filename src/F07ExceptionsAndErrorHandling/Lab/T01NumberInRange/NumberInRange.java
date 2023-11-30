package F07ExceptionsAndErrorHandling.Lab.T01NumberInRange;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ranges = scanner.nextLine();
        int startOfRange = Integer.parseInt(ranges.split(" ")[0]);
        int endOfRange = Integer.parseInt(ranges.split(" ")[1]);

        System.out.printf("Range: [%d...%d]%n", startOfRange, endOfRange);

        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= startOfRange && number <= endOfRange) {
                    System.out.println("Valid number: " + number);
                    break;
                } else {
                    System.out.println("Invalid number: " + number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + input);
            }

        }

    }
}
