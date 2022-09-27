import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvTutari, toplamTutar, kdvOrani1= 0.18,kdvOrani2= 0.08;
        boolean kdvOrani;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        tutar =input.nextDouble();

        kdvOrani = (tutar<1000);
        kdvTutari= (kdvOrani) ? (kdvOrani1 * tutar) :(kdvOrani2*tutar);
        toplamTutar = tutar + kdvTutari ;

        System.out.println("Kdv tutari : " + kdvTutari);
        System.out.println("toplam tutar : " + toplamTutar+ " turk lirasi");




    }
}