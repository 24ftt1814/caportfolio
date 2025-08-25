import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter your message:");
        String message = input.nextLine();

        System.out.print("Enter the substring to replace:");
        String target = input.nextLine();

       
        System.out.print("Enter the replacement string:");
        String replacement = input.nextLine();

        String updatedMessage = message.replace(target, replacement);

        
        System.out.println("The updated message is:");
        System.out.println(updatedMessage);

    }
}