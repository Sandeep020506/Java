import java.util.Scanner ;
public class Return {
    public static void main(String[] args) { 
        greet();
        int first = num();
        int second = num();

        int sum = first + second ;
        System.out.println("ur sum is " + sum );
    }

    public static int num (){
        Scanner input = new Scanner (System.in);
        System.out.println("enter ur 1st no. ");
        int a = input.nextInt();
        return a;
    }
    
    public static void greet(){
        System.out.println("welcome to our calculator ");
    }
}
