import java.util.Scanner;
public class Calculator {
    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Invalid grade");
                    return 0;
                }
            default:
                System.out.println("Invalid Operator ");
                return 0;
        }


    }

    public static void main(String[] args) {
        System.out.print("Please enter a number : ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.print("Enter Operator sign *,/,-,+: ");
        Scanner input2 = new Scanner(System.in);
        char operator2 = input2.next().charAt(0);
        System.out.print("Please enter a number: ");
        Scanner input3 = new Scanner(System.in);
        double b = input3.nextDouble();

        double result = calculate(a, b, operator2);
        System.out.println("The result is " + result);
    }
}