import java.util.*;

public class ATM{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the balance");
        float accountbalance = sc.nextFloat();
        System.out.println("enter the withdraw amount");
        int withdrawal = sc.nextInt();

        float remaining_amt = accountbalance - withdrawal;
        System.out.print("transaction:");

        if(withdrawal%100==0 && remaining_amt>=1000){
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }
    }
}