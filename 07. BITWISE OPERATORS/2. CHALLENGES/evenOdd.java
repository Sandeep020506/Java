import java.util.Scanner ;
public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter ur 1st no. ");
        int a = input.nextInt();

        if ((a & 1) == 1) {
            System.out.println("ur no. is odd");
        } else {
            System.out.println("ur no. is even ");
        }

    }
    
}
