import java.util.Scanner;

public class AdditionWithoutOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();

        while (y != 0) {
            int carry = (x & y) << 1; 
            x = x ^ y;            
            y = carry;        
        }
        System.out.println("Addition of two numbers is:");
        System.out.println(x);

        sc.close();
    }
}
