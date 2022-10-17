import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enBuyukSayi =0, enKucukSayi=0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int sayi = input.nextInt();
            if (i==1){
                enBuyukSayi = sayi;
                enKucukSayi = sayi;
            }
            if (sayi >= enBuyukSayi) {
                enBuyukSayi = sayi;
            }
            if (sayi <= enKucukSayi) {
                enKucukSayi = sayi;
            }
        }
        System.out.println("En büyük sayı : "+ enBuyukSayi);
        System.out.println("En küçük sayı : "+ enKucukSayi);
    }


}


