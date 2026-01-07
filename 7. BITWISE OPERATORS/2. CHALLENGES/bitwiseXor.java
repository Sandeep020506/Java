import java.util.Scanner;
public class bitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter 1st no.");
        int a = input.nextInt();
        System.out.println("enter 2nd no.");
        int b = input.nextInt();

        int result = a ^ b ;
        System.out.println("result is " + result );
    }
}
