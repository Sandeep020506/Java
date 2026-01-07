import java.util.Scanner;
public class bitwiseNot {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter 1st no.");
        int a = input.nextInt();
        
        int result = ~ a;
        System.out.println("result is " + result );
    }
}
