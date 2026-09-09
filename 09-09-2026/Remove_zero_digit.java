// create a code to remove zero digits from a number by user input 
import java.util.Scanner;
public class Remove_zero_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = 0;
        int place = 1;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }
        System.out.println("Number after removing zero digits: " + result);
        sc.close();
    }
}