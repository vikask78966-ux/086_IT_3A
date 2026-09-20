import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;

        while (num > 9) {
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        if (num == 1)
            System.out.println(n + " is a Magic Number");
        else
            System.out.println(n + " is not a Magic Number");

        sc.close();
    }
}
