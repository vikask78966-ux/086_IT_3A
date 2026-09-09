//Duck number by user input
import java.util.Scanner;
public class Duck_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isDuck = false;
        while (num != 0) {
            if (num % 10 == 0) {        
                isDuck = true;
                break;
            }
            num /= 10;
        }
        if (isDuck) {
            System.out.println("The number is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }
        sc.close();
    }
}
