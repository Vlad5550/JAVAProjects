import java.util.Scanner;

public class Sum {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu n:");
        int n = scanner.nextInt();
        System.out.println(sum(n));

        scanner.close();
    }
}