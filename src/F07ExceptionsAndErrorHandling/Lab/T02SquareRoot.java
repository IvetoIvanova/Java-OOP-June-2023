package F07ExceptionsAndErrorHandling.Lab;

import java.util.Scanner;

public class T02SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            double sqrt = calcSqrt(number);
            System.out.printf("%.2f%n", sqrt);
        } catch (NumberFormatException | ArithmeticException exc) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }

    private static double calcSqrt(int number) {
        if (number < 0) {
            throw new ArithmeticException("SQRT is invalid for negative numbers");
        }
        return Math.sqrt(number);
    }
}
