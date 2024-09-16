import java.util.Scanner;

public static void main(String[] args) {
    System.out.println("What would you like to do? (1) Add (2) Subtract (3) Multiply (4) Divide");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    System.out.println("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();

    scanner.close();

    if (choice == 1) {
        System.out.println("The result is: " + Addition.add(num1, num2));
    } else if (choice == 2) {
        System.out.println("The result is: " + Subtraction.subtract(num1, num2));
    } else if (choice == 3) {
        System.out.println("The result is: " + Multiplication.multiply(num1, num2));
    } else if (choice == 4) {
        System.out.println("The result is: " + Division.divide(num1, num2));
    } else {
        System.out.println("Invalid choice");
    }
}
