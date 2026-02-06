import java.util.*;

public class primenumber{
    public static void main(String[] args){
       
      Scanner sc = new Scanner(System.in); 
      System.out.println("enter first number");
      int a = sc.nextInt();
       System.out.println("enter second number");
      int b = sc.nextInt();
      int num = a;
    
      int flag=1;
      System.out.println("prime numbers in between:");
      while(num<b){
        for(int i=2;i<=num/2;i++){
        if(num%i==0){
            flag = 0;
            break;
        }
        }
        if(flag==1){
          System.out.println(num);
        }
        num++;
        flag=1;
      }
    }
}





        
      