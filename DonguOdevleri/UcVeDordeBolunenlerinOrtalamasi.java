import java.util.Scanner;

public class UcVeDordeBolunenlerinOrtalamasi {
    public static void main(String[]args) {
        int k, top = 0,n =0;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();
        for (int i =1;i <=k;i++){
            if ((i%3==0) && (i%4==0)){
                n=n+1;
                top = top + i;
            }
        }
        ort = top/n;
        System.out.println(k + " sayısına kadar 3 ve 4'e bölünebilen sayıların ortalaması : "+ ort);
    }
}