import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
         /*
        Armut: 2.14 TL
        Elma : 3.67 TL
        Domates: 1.11 TL
        Muz: 0.95 TL
        Patlican : 5.00 TL
         */
        double armut =2.14, elma =3.67,domates = 1.11,muz = 0.95, patlican = 5;
        double a,e,d,m,p, tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kac kilo? : ");
        a = input.nextDouble();
        System.out.print("Elma kac kilo? : ");
        e = input.nextDouble();
        System.out.print("Domates kac kilo? : ");
        d = input.nextDouble();
        System.out.print("Muz kac kilo? : ");
        m = input.nextDouble();
        System.out.print("Patlican kac kilo? : ");
        p = input.nextDouble();
        tutar = (a*armut) + (e*elma)  +(d*domates) + (m*muz) + (p*patlican);
        System.out.println("Toplam tutar : " + tutar + " TL");
    }
}