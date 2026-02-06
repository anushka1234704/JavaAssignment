import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            if((num & 1)==1){
                count++;
            }
            num = num>>1;
        }
        System.out.println("Total set bits: " + count);
        sc.close();
    }
}