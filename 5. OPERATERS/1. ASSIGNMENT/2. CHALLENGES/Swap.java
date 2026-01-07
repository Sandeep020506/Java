import java.util.Scanner;
public class Swap {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping two numbers using a temporary variable");
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt
        ();

        int c = a; // Using a temporary variable to hold the value of a
        a = b; // Assigning the value of b to a
        b = c; // Assigning the value of c (original a) to b

        System.out.println("After swapping: ");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
