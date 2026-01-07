import java.util.Scanner;
public class Determine {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("welcome here");
        System.out.println("Enter ur no. ");
        int a = input.nextInt();

        if (a > 0){
            System.out.println("positive ");
        } else if (a < 0 ){
            System.out.println("negative");
        } else {
            System.out.println( " zero ");
        }
    }
    
}
