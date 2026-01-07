import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("RAM RAM JII");
        System.out.println("ENTER YOUR CASTE");
        String caste = input.next();

        if ( caste.equals("JAAT")){
            System.out.println("AARE JAAT KE BALAK");
        } else {
            System.out.println("CHAL BHGLE ");
        }
    }
}
