import java.util.Scanner ;
public class RelProgram  { 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to portal");
        System.out.println("Enter you age ");
        int age = input.nextInt();

        if ( age >= 18 ) {
            System.out.println("u can vote ");
        } else {
            System.out.println( "beta ghr jaao ");
        }
    }
}
    
