import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String []args){
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("2.sayiyi giriniz : ");
        n2 = input.nextInt();
        System.out.println("Yapmak istediginiz islemi seciniz:");
        System.out.println("topla:1\ncikar:2\ncarp:3\nbol:4");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("kalan : "+ (n1-n2));
                break;
            case 3:
                System.out.println("carpim : "+ (n1*n2));
                break;
            case 4:
                boolean zero = (n2==0);
                System.out.println(zero?"bir sayi sifira bolunemez": "bolum : "+(n1/n2));
                break;
            default:
                System.out.println("hatali secim!");
        }
    }
}
