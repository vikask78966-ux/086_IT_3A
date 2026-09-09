//product of digit by user input 
import java.util.Scanner;

public class Product_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int product = 1;
        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }
        System.out.println("Product of digits: " + product);
        sc.close();
    }
}
