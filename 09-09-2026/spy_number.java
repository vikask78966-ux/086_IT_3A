//spy number by a user input 
import java.util.Scanner;
public class spy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        if (sum == product) {
            System.out.println("The number is a spy number.");
        } else {
            System.out.println("The number is not a spy number.");
        }
        sc.close();
    }
}