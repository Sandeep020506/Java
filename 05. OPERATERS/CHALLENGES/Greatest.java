import java.util.Scanner ;
public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("let's find out the bigger no.");
        System.out.println("enter first no.");
        int a = input.nextInt ();
        System.out.println("enter second no.");
        int b = input.nextInt ();
        System.out.println("enter third no. ");
        int c = input.nextInt ();

        if (a >= b && a>=c ) {
            System.out.println("the greatest no. is " + a);
        } else if (b >= a && b>=c ){
            System.out.println("the greatest no. is " + b);
        } else {
            System.out.println("the greatest no. is " + c);
        }
    }
    
}
