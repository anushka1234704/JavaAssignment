import java.util.Scanner;

public class digitanalysis{
    public static void main(String[] args){
        int rem;
        int reverse=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the integer");
      int num = sc.nextInt();
      int temp=num;
      int flag=num;
      while(num>0){
        rem = num%10;
        reverse = reverse*10+rem;
        num = num/10;
      }
      System.out.println("reverse of the integer:");
      System.out.println(reverse);
      int sum = 0;
      while(temp>0){
        
        rem = temp%10;
        sum = sum + rem;
        temp = temp/10;
      }
      System.out.println("sum of the digits is:");
      System.out.println(sum);
      int count=0;

      while(flag>0){
       flag = flag/10;
      count++;
     
      }
      System.out.println("count:");
      System.out.println(count);
    }
}

      