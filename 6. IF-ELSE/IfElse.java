import java.util.Scanner;

public class IfElse {
   public IfElse() {
   }

   public static void main(String[] var0) {
      System.out.println("welcome to ifelse ");
      Scanner input = new Scanner(System.in);
      System.out.println("enter an even no.");
      int a = input.nextInt();
      if (a % 2 == 0) {
         System.out.println("Your number is even");
      } else {
         System.out.println("Your number is odd");
      }

   }
}
