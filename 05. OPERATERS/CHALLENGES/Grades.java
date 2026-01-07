import java.util.Scanner ;
public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lets calculate ur grade");
        System.out.println("enter ur marks from 1 to 100");
        int Marks = input.nextInt();

        if (Marks >= 90 ){
            System.out.println("ur grade is A");
        } else if (Marks >= 75 ){
            System.out.println("ur grade is B");
        } else if (Marks >= 60 ){
            System.out.println("ur garde is C");
        } else if (Marks >= 30){
            System.out.println("ur grade is D");
        } else {
            System.out.println("ohh u failed ");
        }
    }
    
}
