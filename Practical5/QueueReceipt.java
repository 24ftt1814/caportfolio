import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Receipt generated. Thank you.");
        String upperName = name.toUpperCase();
         new File("C:\\Practical 5");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateTime = now.format(formatter);

       
        Random rand = new Random();
        int queueNumber = rand.nextInt(1000) + 1; 
         FileWriter writer = new FileWriter( "C:\\Practical 5/QReceipt.txt");

            writer.write("Date & Time: " + dateTime + "\r\n");
            writer.write("Welcome, " + upperName + "!\r\n");
            writer.write("Your queue number is: " + queueNumber + "\r\n");
            writer.close();
        }



    }

