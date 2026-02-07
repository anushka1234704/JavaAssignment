// quotient without using the / or % operators.
import java.util.Scanner;

public class QuotientWithoutDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend");
        int x = sc.nextInt();

        System.out.println("Enter divisor");
        int y = sc.nextInt();

        int quotient = 0;

        while (x >= y) {
            int temp = y, count = 1;

            while ((temp << 1) <= x) {
                temp <<= 1;
                count <<= 1;
            }

            x -= temp;
            quotient += count;
        }

        System.out.println("Result:");
        System.out.println(quotient);

        sc.close();
    }
}

