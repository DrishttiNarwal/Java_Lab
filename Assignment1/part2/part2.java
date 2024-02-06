package part2;

import java.util.ArrayList;
import java.util.Scanner;

public class calculator_main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        functions calculator = new functions();
        ArrayList<Double> numberList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 5:
                    System.out.println("Result: " + calculator.sqrt(scanner.nextDouble()));
                    break;
                case 6:
                    System.out.println("Result: " + calculator.power(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 7:
                    System.out.println("Enter numbers (type 'end' to finish):");
                    while (scanner.hasNextDouble()) {
                        numberList.add(scanner.nextDouble());
                    }
                    scanner.next();
                    double[] numbers = numberList.stream().mapToDouble(i -> i).toArray();
                    System.out.println("Mean: " + calculator.mean(numbers));
                    numberList.clear();
                    break;
                case 8:
                    System.out.println("Enter numbers (type 'end' to finish):");
                    while (scanner.hasNextDouble()) {
                        numberList.add(scanner.nextDouble());
                    }
                    scanner.next();
                    numbers = numberList.stream().mapToDouble(i -> i).toArray();
                    System.out.println("Variance: " + calculator.variance(numbers));
                    numberList.clear();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
    }
}