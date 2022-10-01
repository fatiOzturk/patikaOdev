import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fiz, kimya, turkce, muzik,toplamNot = 0,sayac = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("0 -100 aralıgında olmayan notlar ortalamaya katilmaz");
        } else {
            toplamNot += mat;
            sayac +=1;
        }

        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();
        if (fiz < 0 || fiz > 100) {
            System.out.println("0 -100 aralıgında olmayan notlar ortalamaya katilmaz");
        } else {
            toplamNot += fiz;
            sayac += 1;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("0 -100 aralıgında olmayan notlar ortalamaya katilmaz");
        } else {
            toplamNot += kimya;
            sayac += 1;
        }

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("0 -100 aralıgında olmayan notlar ortalamaya katilmaz");
        } else {
            toplamNot += turkce;
            sayac += 1;
        }

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("0 -100 aralıgında olmayan notlar ortalamaya katilmaz");
        } else {
            toplamNot += muzik;
            sayac += 1;
        }
        ortalama = toplamNot / sayac;
        if (ortalama > 55) {
            System.out.println("Tebrikler Gectiniz... Not Ortalamaniz: " + ortalama);
        } else {
            System.out.println("Maalesef Kaldınız!!! Not Ortalamaniz: " + ortalama);
        }
    }

}
