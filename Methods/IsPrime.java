import java.util.Scanner;

public class IsPrime {

    static boolean isPrime(int number, int i) {

/*          kullanıcıdan alınan bir sayıyıya "number" dersek;
             2'den başlayarak  "number"/2 (yani yarısına kadar) her sayıya böldüğümüzde
             tam bölünmüyorsa asaldır...
             For example: 79 sayısının yarısı 39.
             eğer 79 sayısı 2'den 39'a kadar her hangi bir sayıya tam bölünmüyorsa
             zorlamanın anlamı yok, asaldır.
*
* */
        if (number % i == 0) {
            System.out.println(number + " is NOT a prime number !");
            return false;
        }

        if
        (i == (number / 2) + 1) {
            System.out.println(number + " is a prime number !");
            return true;

        }
        i++;
        return isPrime(number, i);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 2;
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        System.out.println(isPrime(number, i));

    }
}