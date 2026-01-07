import java.util.Scanner;
public class evenodd {
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        System.out.println("welcome ");
        System.out.println("enter ur no. ");
        int a = input.nextInt ();

        if (a % 2 == 0 ){
            System.out.println("ur no. is even ");
        } else {
            System.out.println("ur no. is odd");
        }
    }
    
}
