import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri oluştur (dersler)
        int mat,fizik,kimya,turkce,tarih,muzik;
        // Scanner sınıfları tanımla
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan değerleri al


        System.out.print("Matemetik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih +muzik);
        double ort = toplam / 6;
        System.out.println("Not Ortalamaniz= "+ort);
        boolean sonuc = (ort>60);
        String result = (sonuc) ? "Sinifi gecti" : "Sinifta kaldi" ;
        System.out.println(result);
    }
}