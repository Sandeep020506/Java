import java.util.Scanner;
public class Perimeter {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to perimeter calculator ");

        System.out.println("enter your length ");
        int length = input.nextInt();
        System.out.println("enter your breadth ");
        int breadth = input.nextInt();

        int peri = 2 * (length + breadth);
        System.out.println("the perimeter of rectangle is " + peri);
    }
    
}
