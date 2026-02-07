// Number Classification Tool
import java.util.Scanner;

public class numberclassification{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the integer");
      int a = sc.nextInt();

      if(a>0){
        System.out.println("positive");
      }
      else{
        System.out.println("negative");
      }
      if(a%2==0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
      if(a%5==0 && a%7==0){
        System.out.println("divisible by both 5 and 7");
      }
      else{
        System.out.println("not divisible by both 5 and 7");
      }
    }
}

