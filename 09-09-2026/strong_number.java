// strong number by user input 
import java.util.Scanner;
public class strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0) {  
            int digit = num % 10;  
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;  
            num /= 10;  
        }
        if (originalNum == sum) {
            System.out.println(originalNum + " is a strong number.");
        } else {
            System.out.println(originalNum + " is not a strong number.");
        }
        sc.close();
    }
}
