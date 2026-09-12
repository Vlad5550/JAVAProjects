
import java.util.Scanner;

public class BiggestNumb {
    
        public static int findBiggest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int biggest = findBiggest(num1, num2, num3);            //Calling the method to find the biggest number
        System.out.println("The biggest number is: " + biggest);
    }

}
