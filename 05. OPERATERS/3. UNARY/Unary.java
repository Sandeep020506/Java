public class Unary {
    public static void main(String[] args) {
        int a = 14 ;
        int b = 7;
        int c = 3;
        int d = 2;

        System.out.println( +a ); // Unary plus
        System.out.println( -b ); // Unary minus 

        c = ++c + 2;
        d = --d - 2; 
        System.out.println( ++c ); // Pre-increment
        System.out.println( --d ); // Pre-decrement

        c = c++ + 2;
        d = d-- - 2;
        System.out.println( c++ ); // Post-increment
        System.out.println( d-- ); // Post-decrement

        System.out.println( c );
        System.out.println( d );
    }
    
}
