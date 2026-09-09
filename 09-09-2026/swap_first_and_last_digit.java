// create a code to swap the first and last digits of a number by user input 
import java.util.Scanner;
public class swap_first_and_last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int firstDigit = num;
        int lastDigit = num % 10;
        int numDigits = 0;
        while (firstDigit >= 10) {
            firstDigit /= 10;
            numDigits++;
        }
        int swappedNum = lastDigit * (int) Math.pow(10, numDigits) + (num % (int) Math.pow(10, numDigits)) / 10 * (int) Math.pow(10, numDigits - 1) + firstDigit;
        System.out.println("Number after swapping first and last digits: " + swappedNum);
        sc.close();
    }
}  
