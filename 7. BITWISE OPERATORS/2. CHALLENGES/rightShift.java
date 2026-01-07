import java.util.Scanner;
public class rightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter 1st no.");
        int a = input.nextInt();

        int result = a >> 3 ;
        System.out.println("result is " + result );
    }
}
