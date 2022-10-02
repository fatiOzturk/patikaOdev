import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        int km,age,way;
        double perKm = 0.10,tutar, cocukUcretOrani = 0.50, gencUcretOrani= 0.90, yasliUcretOrani=0.70,
        donusOrani =0.80, toplamTutar ;

        String wrongInput = "Hatali bir veri girdiniz! Lutfen bilgilierinizi dogru giriniz.";

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceginiz mesafeyi 'KM' cinsinden giriniz : ");
        km = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        age = input.nextInt();

        System.out.print("Tek yon icin '1', gidis - donus bileti almak icin '2' yaziniz : ");
        way = input.nextInt();

        if ((km>=1) && (age>=1) && ((way==1) || (way==2))) {
            tutar = (km * perKm);
            if (age<=11){
                toplamTutar = (tutar  * cocukUcretOrani);
            } else if (age<=24){
                toplamTutar = (tutar * gencUcretOrani);
            } else if (age >= 65) {
                toplamTutar = (tutar * yasliUcretOrani);
            }else {
                toplamTutar = tutar;
            }

            if (way == 1) {
                System.out.print("Bilet Fiyatiniz: " + (toplamTutar));
            }else {
                toplamTutar = (toplamTutar * donusOrani*2);

                System.out.print("Bilet Fiyatiniz: " + (toplamTutar));
            }
        }else {
            System.out.print(wrongInput);
        }
    }
}