import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        //Exercise 3
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter two floating-point numbers
        System.out.println("Enter the first number:  ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:  ");
        double num2 = scanner.nextDouble();

        //Prompt the user to choose an operation
        System.out.println("Choose an operation ");
        System.out.println("A. Add");
        System.out.println("S. Subtract");
        System.out.println("M. Multiply");
        System.out.println("D. Divide");

        //Read the user's choice
        System.out.println("Enter your choice (A/S/M/D):  ");
        char choice = scanner.next().toUpperCase().charAt(0);

        //Perform the selected operation and display the result
        double result = 0;

        result += (choice == 'A') ? num1 + num2 : 0;
        result += (choice == 'S') ? num1 - num2 : 0;
        result += (choice == 'M') ? num1 * num2 : 0;
        result += (choice == 'D' && num2 != 0) ? num1 / num2 : 0;

        System.out.printf("Result: %.2f%n", result);

        scanner.close();

    }
}
