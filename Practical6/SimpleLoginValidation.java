import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLoginValidation {
    public static void main(String[] args) {
    
        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        System.out.print("Please enter your password: ");
        String password = input.nextLine();

       
        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                String currentTime = formatter.format(new Date());
                System.out.println("Welcome " + username + ". The time now is " + currentTime);
            } 
            else{
                System.out.println("Error: Password does not match.");
            }
        } 
        else{
            System.out.println("Error: Invalid Username.");
        }
    }
}
