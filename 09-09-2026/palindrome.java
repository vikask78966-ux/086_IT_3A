//create a code to palindrome a number by a user input
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversed = 0;
        while (num != 0) {  
            reversed = reversed * 10 + num % 10;  
            num /= 10;  
        }
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
        sc.close();
    }
}