import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("welcome to arithmatic calculator ");
        
        System.out.println("enter your first number ");
        int first = input.nextInt();
        System.out.println("enter your second number ");
        int second = input.nextInt();

        int sum = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;
        System.out.println("the sum of two number is " + sum);
        System.out.println("the sub of two number is " + sub);
        System.out.println("the mul of two number is " + mul);
        System.out.println("the div of two number is " + div);
        System.out.println("the mod of two number is " + mod);        
    }
    
}
