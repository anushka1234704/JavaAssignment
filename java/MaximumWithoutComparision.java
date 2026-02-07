// Maximum Without Comparison
import java.util.Scanner;

public class MaximumWithoutComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        int diff = num1 - num2;
        int sign = diff >> 31;
        int max = num1 - (sign & diff);
        System.out.println("Larger Number is: "+max);
        sc.close();

    }

}
