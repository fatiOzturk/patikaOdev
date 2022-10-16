import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, r, n,f, sonuc, fakn=1, fakr=1,fakf=1;
        boolean gecerli;
        System.out.print("Kümenin elaman sayısını giriniz : ");
        n= input.nextInt();
        do {System.out.print("Kombinasyonların kaç elemanlı olacağını giriniz : ");
            r=input.nextInt();
            if(r>n){
                System.out.println("Kombinasyon, küme sayısından büyük olamaz.");
                gecerli = true;
            } else {
                f=n-r;
                for (i=1; i<=n; i++){
                    fakn = fakn*i;
                }
                for (i=1; i<=r; i++){
                    fakr = fakr*i;
                }
                for (i=1;i<=f;i++){
                    fakf*=i;
                }
                gecerli = false;
            }
        } while (gecerli ==true);
        sonuc= fakn / (fakr * (fakf));
        System.out.println("Kombinasyon("+n+","+r+") = "+ sonuc);
    }}
