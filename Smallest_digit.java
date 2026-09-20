import java.util.Scanner;
public class Smallest_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int smallestDigit = 10;
        while (n != 0) {
            int digit = n % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            n = n / 10;
        }
        System.out.println("Smallest digit in " + original + " is " + smallestDigit);
        sc.close();
    }
}
