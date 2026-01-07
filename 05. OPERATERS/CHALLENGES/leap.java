import java.util.Scanner ;
public class leap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lets find out that the year is leap or not ");
        System.out.println("enter ur year");
        int year = input.nextInt ();

        if (year % 400 == 0 ) {
            System.out.println("leap year");
        } else if (year % 100 == 0) {
            System.out.println("not a leap year ");
        } else if ( year % 4 == 0 ) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

    }   
}
