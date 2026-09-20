import java.util.Scanner;

public class Sunny_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int next = n + 1;
        int i = 1;

        while (i * i < next) {
            i++;
        }

        if (i * i == next)
            System.out.println(n + " is a Sunny Number");
        else
            System.out.println(n + " is not a Sunny Number");

        sc.close();
    }
}
