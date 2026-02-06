import java.util.Scanner;

public class ConstantMultiplicationBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        int result = (num<<3) - num;
        System.out.println("Output is: " + result);
        sc.close();

    }
}