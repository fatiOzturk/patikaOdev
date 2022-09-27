import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar Uzunlugu Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Kenar Uzunlugu Giriniz : ");
        b = input.nextInt();

        System.out.print("3. Kenar Uzunlugu Giriniz : ");
        c = input.nextInt();
        // if/else ile aşağıdaki gibi yazabilriz
/*
        if ((a+b)<c || (a+c)<b || (b+c)<a){
            System.out.println("ucgenin iki kenarinin uzunluklari toplami diger kenardan kisa olamaz!");
        }   else {
        u = (a+b+c)/2;
        alan = Math.sqrt (u * (u-a)*(u-b)*(u-c));

        System.out.println("Kenar uzunluklari verilen ucgenin alanı : " + alan);
        }
*/
        boolean ucgenDegil = ((a+b)<c || (a+c)<b || (b+c)<a) ;
        u = (a+b+c)/2;
        alan = Math.sqrt (u * (u-a)*(u-b)*(u-c));
        System.out.println(ucgenDegil ?
                "ucgenin iki kenarinin uzunluklari toplami diger kenardan kisa olamaz!" :
                "Kenar uzunluklari verilen ucgenin alanı : " + alan);


    }
}