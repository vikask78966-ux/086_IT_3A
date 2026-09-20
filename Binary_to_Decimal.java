import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal of " + binary + " is: " + decimal);

        sc.close();
    }
}
    