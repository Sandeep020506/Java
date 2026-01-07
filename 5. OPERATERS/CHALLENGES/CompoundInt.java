import java.util.Scanner ;
public class CompoundInt {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to compound interest calculator ");
        System.out.println("enter your principal amount ");
        int principal = input.nextInt();
        System.out.println("enter your rate of interest ");  
        float rate = input.nextFloat();
        System.out.println("enter your time period in years ");
        int time = input.nextInt();

        double CI = principal * (Math.pow((1 + rate / 100), time));
        System.out.println("the compound interest is " + CI);
    }
    
}
