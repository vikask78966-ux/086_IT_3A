import java.util.Scanner;

public class Count_Odd_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                count++;
            }

            n = n / 10;
        }

        System.out.println("Number of odd digits = " + count);

        sc.close();
    }
}
