// Multiplication via Bit Shifting
import java.util.Scanner;

public class MultiplicationWithoutOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int product = 0;
        while(num2 != 0){
            if((num2 & 1) == 1){
                product = product + num1;
            }
            num1 = num1<<1;
            num2 = num2>>1;
        }
        System.out.println("Product of two number is: "+ product);
        sc.close();

    }

}
