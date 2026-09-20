import java.util.Scanner;
public class prime_digit_only {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrimeDigitOnly = true;
        int original = n;
        while (n != 0) {
            int digit = n % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                isPrimeDigitOnly = false;
                break;
            }
            n = n / 10;
        }
        if (isPrimeDigitOnly) {
            System.out.println(original + " contains only prime digits.");
        } else {
            System.out.println(original + " does not contain only prime digits.");
        }
        sc.close();
    }
}
