import java.util.*;

public class authentication{
    public static void main(String[] args){
        String username = "Anushka Agrawal";
        int password = 2345;
         Scanner sc = new Scanner(System.in);
         int flag=0;

         while(flag<4){
             if(flag==3){
            System.out.println("you have reached your attempts.UNLOCKED FAILED!");
         }
             System.out.println("enter the username");
             String name = sc.nextLine();
             System.out.println("enter the password");
             int pass = sc.nextInt();
             sc.nextLine();
         
         if(flag==3){
            System.out.println("you have reached your attempts.UNLOCKED FAILED!");
         }
         else{
            if(name.equals(username) && pass==password){
                System.out.println("UNLOCKED SUCCESS");
                break;
            }
            else{
                System.out.println("wrong details !..try again");
            }
         }
         flag++;
         }
    }
}

        

