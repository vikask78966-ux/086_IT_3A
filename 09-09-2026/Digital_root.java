// create a code to digital root by auser input 
import java.util.Scanner;
public class Digital_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digitalRoot = calculateDigitalRoot(num);    
        System.out.println("The digital root of " + num + " is " + digitalRoot);
        sc.close();
    }

    public static int calculateDigitalRoot(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}