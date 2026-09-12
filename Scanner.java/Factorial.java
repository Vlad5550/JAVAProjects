import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();                                                   // Read user input
        long fact = 1;                                                             // Initialize factorial to 1
        for (int i = 1; i <= n; i++) {                                              // Loop from 1 to n
            fact *= i; 
    }
    System.out.println("Factorial of " + n + " is: " + fact );
    }
   
}
