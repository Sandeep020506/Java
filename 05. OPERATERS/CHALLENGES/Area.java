import java.util.Scanner ;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to area calculator ");
        System.out.println("enter your base ");
        int base = input.nextInt();
        System.out.println("enter your height ");  
        int height = input.nextInt();

        int area = (base * height) / 2;
        System.out.println("the area of triangle is " + area);
    }
    
}
