// Electricity Bill Generator 
import java.util.*;

public class electricitybill{
    public static void main(){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the units consumed");
       int units = sc.nextInt();
       float charge=0;
       float temp;
       if(units<=100){
        charge = units*2;
       }
       else if(units>=100 && units<=200){
        temp=units-100;
        charge = temp*3 + 100*2;
       }
       else if(units>200){
        temp=units-200;
        charge = temp*5 + 100*2 + 100*3;
       }
       float final_charge;
       final_charge = charge + 150;
       System.out.println("final charges:");
       System.out.print(final_charge); 
    }
}

      
