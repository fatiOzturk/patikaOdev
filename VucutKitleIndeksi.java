import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy , kilo , VKI ;
        // ForNUL = kilo / boy * boy
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();

        VKI = kilo / Math.pow(boy,2);

        System.out.print("Vucut kitle indeksiniz : "+VKI);



    }
}