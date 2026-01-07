import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        System.out.println("welcome to fahrenheit to celsius converter ");
        Scanner input = new Scanner(System.in);
        System.out.println("enter fahrenheit ");
        float fahrenheit = input.nextFloat();
        float cel = (fahrenheit - 32) * 5 / 9;
        System.out.println("the celsius is " + cel);
    }
    
}
