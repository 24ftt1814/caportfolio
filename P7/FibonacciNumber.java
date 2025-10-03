import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the term : ");
        int n = input.nextInt();

      
        if (n == 0) {
            System.out.println("At term 0 the number is 0");
        } else if (n == 1) {
            System.out.println("At term 1 the number is 1");
        } else {
            int f0 = 0; 
            int f1 = 1; 
            int fn = 0; 

           
            for (int i = 2; i <= n; i++) {
                fn = f0 + f1; 
                f0 = f1;      
                f1 = fn;
            }

            System.out.println("At term " + n + " the number is " + f1);
        }

        input.close();
    }
}

