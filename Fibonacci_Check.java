import java.util.Scanner;
public class Fibonacci_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        boolean isFibonacci = false;

        if (n == 0 || n == 1) {
            isFibonacci = true;
        } else {
            while (b < n) {
                c = a + b;
                a = b;
                b = c;
            }
            if (b == n) {
                isFibonacci = true;
            }
        }

        if (isFibonacci) {
            System.out.println(n + " is a Fibonacci number.");
        } else {
            System.out.println(n + " is not a Fibonacci number.");
        }

        sc.close();
    }
}
