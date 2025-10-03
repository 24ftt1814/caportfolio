// 7.1 – LoopsLoopsLoops.java
// Write a program that will:
// 1) Generate the number 1 to 20 using while loop.
// 2) Generate the number decreasing from 50 to 35 using dowhile loop.
// 3) Generate the alphabet a to z using a for loop and one char datatype.
// Hint: Create 2 int datatype as counter and 1 char datatype. Using increment and decrement
// to change the value to be displayed the value and also to stop the loop.
// Refer to Lecture 9 slide 15 for while loop sample, slide 19 for dowhile loop sample and slide
// 24 for for loop sample.
// <output>
// Below is generated using while loop:
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
// Below is generated using dowhile loop:
// 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35
// Below is generated using for loop:
// a b c d e f g h i j k l m n o p q r s t u v w x y z
// <output>

import java.util.Scanner ;

public class LoopsLoopsLoop {
    public static void main(String[] args) {       
    Scanner input = new Scanner(System.in);

     System.out.println("Below is generated using while loop:");
        int i = 1; 
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    
        
     System.out.println("Below is generated using dowhile loop:");
        int j = 50;
        do {
            System.out.print(j + " ");
            j--;
        }
        
        while (j >= 35);
        System.out.println();

        System.out.println("Below is generated using for loop:");
        for (char a = 'a'; a <= 'z'; a++) {
            System.out.print(a + " ");
        }
        
        System.out.println();
        
    }
}
