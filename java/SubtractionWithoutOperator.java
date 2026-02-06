import java.util.Scanner;

public class SubtractionWithoutOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int x = sc.nextInt(); 
        System.out.println("enter the second number");
        int y = sc.nextInt(); 
        y = (~y) + 1;
        while (y != 0) {
            int carry = (x & y) << 1;
            x = x ^ y;
            y = carry;
        }
        System.out.println("result:");
        System.out.println(x);

        sc.close();
    }
}
