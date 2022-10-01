import java.util.Scanner;

/**
 * Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 * boolean ile değişik bir çözüm olsun istedim.
 */
public class SayiSiralama {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print(" a sayisini yaziniz : ");
        a = input.nextInt();
        System.out.print(" b sayisini yaziniz : ");
        b = input.nextInt();
        System.out.print(" c sayisini yaziniz : ");
        c = input.nextInt();
        boolean abc = (a <= b && b <= c);
        boolean acb = (a <= c && c <= b);
        boolean bac = (b <= a && a <= c);
        boolean bca = (b <= c && c <= a);
        boolean cab = (c <= a && a <= b);
        boolean cba = (c <= b && b <= a);

        if (abc) {
            System.out.println("a<=b<=c");
        } else if (acb) {
            System.out.println("a<=c<=b");
        } else if (bac) {
            System.out.println("b<=a<=c");
        } else if (bca) {
            System.out.println("b<=c<=a");

        } else if (cab) {
            System.out.println("c<=a<=b");

        } else {
            System.out.println("c<=b<=a");
        }
    }
}