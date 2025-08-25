import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        
        Random rand = new Random();
        int num1 = rand.nextInt(100) + 1; 
        int num2 = rand.nextInt(100) + 1; 

  
        new File("C:\\Practical 5");
       
        FileWriter writer= new FileWriter("C:\\Practical 5/Modulus Questions.txt",true);
      
        
        writer.write(num1 + "% " + num2 + " = ?"+ "\r\n") ;
        writer.close();
        
        System.out.println("A new question added");
    }
}