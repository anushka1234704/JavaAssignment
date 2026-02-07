//Menu-Driven Calculator
import java.util.*;

public class calculator{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     System.out.println("enter the first number");
      float a = sc.nextFloat();
      System.out.println("enter the second number");
      float b = sc.nextFloat();
      System.out.println("operations");
      System.out.println("1:Addition");
      System.out.println("2:Subtraction");
      System.out.println("3:Multiplication");
      System.out.println("4:Division");
      System.out.println("5:Modulus");
                         
      System.out.println("enter the choice");
      int choice = sc.nextInt();
      switch(choice){
        case 1:System.out.println(a+b);
        break;
        case 2:System.out.println(a-b);
        break;
        case 3:System.out.println(a*b);
        break;
        case 4:System.out.println(a/b);
        break;
        case 5:System.out.println(a%b);
        break;
        default:System.out.println("invalid choice");
      }
    }

}
