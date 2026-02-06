import java.util.*;

public class biling{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the price");
        float price = sc.nextInt();
        System.out.println("enter the quantity");
        int quantity = sc.nextInt();
        float bill = quantity*price;
        if(bill>=2000 && bill<5000){
            bill=bill-bill*5/100;
        }
        else if(bill>=5000){
            bill = bill-bill*10/100;
        }
        else{
            bill = bill;
        }
        bill = bill+bill*18/100;
        System.out.println("final payable amount");
        System.out.print(bill);
    }

}