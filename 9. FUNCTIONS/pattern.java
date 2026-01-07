public class pattern {
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern(){
        int row = 0;
        while (row < 10 ){
            System.out.print("&");
            int i = 0;
            while (i < row) {
                System.out.print(" &");
                i++;
            }
            System.out.println();
            row++;
        }
    }
    
}
