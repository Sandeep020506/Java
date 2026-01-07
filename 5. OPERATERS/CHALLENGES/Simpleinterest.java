import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to simple interest calculator ");
        System.out.println("enter your principal ");
        int principal = input.nextInt();
        System.out.println("enter your rate of interest ");
        float rate = input.nextFloat();
        System.out.println("enter your time period ");
        int time = input.nextInt();
        float si = (principal * rate * time) / 100;
        System.out.println("the simple interest is " + si);
        
    }
    
}
