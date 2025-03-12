import java.util.Scanner;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("\nAssignment Operators:");

        num1 = num2;
        System.out.println("After = : num1 = " + num1);

        num1 += num2;
        System.out.println("After += : num1 = " + num1);

        num1 -= num2;
        System.out.println("After -= : num1 = " + num1);

        num1 *= num2;
        System.out.println("After *= : num1 = " + num1);

        if (num2 != 0) {
            num1 /= num2;
            System.out.println("After /= : num1 = " + num1);
        } else {
            System.out.println("Division by zero is not allowed for /= operator.");
        }

        if (num2 != 0) {
            num1 %= num2;
            System.out.println("After %= : num1 = " + num1);
        } else {
            System.out.println("Division by zero is not allowed for %= operator.");
        }
    }
}
