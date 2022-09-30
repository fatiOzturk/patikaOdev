import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,isChange,newPassword;


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adi : ");
        userName = input.nextLine();

        System.out.print("Sifre : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("***Giris yaptiniz***");
        } else {
            System.out.println("Kullanici adi veya sifre hatali!!!");
            System.out.println("Sifrenizi sifirlamak ister misiniz? (Yy/Nn)");

            isChange = input.nextLine();
            if (isChange.equals("Y") || isChange.equals("y")) {
                System.out.println("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Sifre oluşturulamadi, lütfen başka sifre giriniz.");
                } else {
                    System.out.println("Sifeniz başarılı bir şekilde oluturuldu");
                }
            } else {
                System.out.println("Tekrar deneyiniz...");
            }
        }
    }
}
