import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int tahmin = rand.nextInt(100);
        int sayi;
        int[] yanlislar = new int[5];
        for (int hak=4;hak>=0;hak--){
            System.out.print("Sayı giriniz : ");
            sayi = input.nextInt();
            while (sayi<0 || sayi>99){
                System.out.print("0 ile 100 arasında bir sayi girmelisiniz!\n sayı giriniz : ");
                sayi = input.nextInt();
            }
            yanlislar[hak]=sayi;
            if (sayi==tahmin){
                System.out.println("Tebrikler...");
                break;
            }else if (sayi>tahmin){
                System.out.println(sayi+" sayısı gizli sayıdan büyüktür. Kalan hakkınız : "+ hak);
            }else {
                System.out.println(sayi+" sayısı gizli sayıdan küçüktür. Kalan hakkınız : "+ hak);
            }
        }
        if (yanlislar[0]!=0){
            System.out.println("Girmiş olduğunuz sayılar : "+Arrays.toString(yanlislar));
            System.out.println("Doğru sayı : "+tahmin);
        }
    }
}