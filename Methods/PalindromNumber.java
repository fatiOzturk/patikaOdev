import java.util.Scanner;

/**
 * PALINDROM NUMBER
 */
public class PalindromNumber {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = inp.nextInt();
        if (isPalindrom(a)) {
            System.out.println(a + " Palindrom sayıdır.");
        } else {
            System.out.println(a + " Palindrom sayı değildir.");
        }
    }
}