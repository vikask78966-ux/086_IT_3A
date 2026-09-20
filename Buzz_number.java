import java .util.Scanner;
public class Buzz_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println(n + " is a Buzz number.");
        } else {
            System.out.println(n + " is not a Buzz number.");
        }

        sc.close();
    }
}
