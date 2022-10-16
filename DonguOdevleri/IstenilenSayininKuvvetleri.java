import java.util.Scanner;

public class IstenilenSayininKuvvetleri {
    public static void main(String[] args) {
        int n, kuvvet;
        Scanner input = new Scanner(System.in);
        boolean gecerli;
        do {
            gecerli = false;
            System.out.print("Sınır Sayısını Giriniz : ");
            n = input.nextInt();
            if (n >= 0) {
                System.out.print("Hangi sayının kuvvetlerini istiyorsunuz : ");
                kuvvet = input.nextInt();
                System.out.println(n + " sayisina kadar olan " + kuvvet + " sayısının kuvvetleri : ");
                for (int i = 1; i <= n; i *= kuvvet) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Gecersiz sayi girdiniz");
                gecerli = true;
            }
        } while (gecerli);
    }
}