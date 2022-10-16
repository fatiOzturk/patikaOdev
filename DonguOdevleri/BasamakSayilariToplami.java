import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main (String[]args){

        /*Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14*/

        int sayi,basValue,result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();
        while (sayi != 0){
            basValue = sayi%10;
            result+=basValue;
            sayi /=10;
        }
        System.out.println("Girilen sayının basamakları toplamı : "+result);
    }
}
