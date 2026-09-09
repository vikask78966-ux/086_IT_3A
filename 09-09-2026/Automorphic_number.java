//Automorphic number by user input
import java.util.Scanner;
public class Automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        boolean isAutomorphic = true;
        while (num != 0) {
            if (num % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            num /= 10;
            square /= 10;
        }
        if (isAutomorphic) {
            System.out.println("The number is an Automorphic number.");
        } else {
            System.out.println("The number is not an Automorphic number.");
        }
        sc.close();
    }
}  
