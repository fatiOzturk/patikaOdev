import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total = 0, i;
        System.out.print("Sayi giriniz: ");
        num = sc.nextInt();
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        String result = (num==total)? num + " mukemmel sayıdır.": num + " mukemmel sayı değildir.";
        System.out.println(result);
    }
}