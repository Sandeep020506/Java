import java.util.Scanner  ;
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("welcome to my shop ");
        System.out.println("enter ur age");
        int age = input.nextInt () ;
        System.out.println("are u a female ? (t or f) ");
        boolean isFemale = input.nextBoolean ();

        if (age < 5 ){
            System.out.println("u got 5 % discount ");
        } else if (isFemale) {
            System.out.println("u got 10 % discount ");
        } else if (age > 5 && !isFemale) {
        System.out.println("u got 50 % discount");
        } else {
            System.out.println("u got 75 % discount");
        }
    }
    
}
