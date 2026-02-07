// The Temporary-less Swap.
import java.util.Scanner;

public class swappingusingbitwise{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number(x)");
        int x = sc.nextInt();

        System.out.println("Enter second number(y)");
        int y = sc.nextInt();

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        sc.close();
    }
}

