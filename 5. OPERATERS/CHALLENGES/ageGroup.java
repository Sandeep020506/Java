import java.util.Scanner ;
public class ageGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter ur age");
        int age = input.nextInt ();

        if (age <= 13) {
            System.out.println("hello child");
        } else if (age <= 20 ) {
            System.out.println("hello teen");
        } else if (age < 60 ) {
            System.out.println("hello adult");
        } else {
            System.out.println("hello senior");
        }
    }    
}
