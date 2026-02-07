// Employee Salary Calculator 
import java.util.*;

public class salarycalculator{
    public static void main(){
        float HRA,PF,DA,netsalary; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary");
        int salary = sc.nextInt();

        if(salary>=30000){
            HRA = salary*20/100;
            DA = salary*15/100;
        }
        else{
            HRA = salary*10/100;
            DA = salary*8/100;
        }
        PF = salary*12/100;
        netsalary= salary+HRA+DA-PF;
        System.out.println("calculated net salary:");
        System.out.print(netsalary);
                    }

}
