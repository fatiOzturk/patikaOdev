import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdvOrani1= 0.18;
        double kdvOrani2= 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar =input.nextDouble();
        boolean kdvOrani = (tutar<1000);
        double kdvTutari= (kdvOrani) ? (kdvOrani1 * tutar) :(kdvOrani2*tutar);
        double toplamTutar = tutar + kdvTutari ;
        System.out.println("Kdv tutari : " + kdvTutari);
        System.out.println("toplam tutar : " + toplamTutar+ " turk lirasi");




    }
}