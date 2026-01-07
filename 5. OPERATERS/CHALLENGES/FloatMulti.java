import java.util.Scanner;
public class FloatMulti {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to float multiplication calculator ");
        
        System.out.println("enter your first number ");
        float first = input.nextFloat();
        System.out.println("enter your second number ");
        float second = input.nextFloat();

        float mul = first * second;
        System.out.println("the mul of two number is " + mul);

    }    
}
