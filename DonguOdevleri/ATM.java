import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,passWord;
        int balance = 1500, right=3,select;
        while (right >0){
            System.out.print("Kullanıcı Adınız : ");
            userName = inp.nextLine();
            System.out.print("parolanız : ");
            passWord = inp.nextLine();
            if (userName.equals("fati") && passWord.equals("5042")){
                System.out.println("Welcome to BANK\n");
                do {
                    System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgulama\n"+"4-Çıkış\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("\nBakiyeniz : "+balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            price = inp.nextInt();
                            if (price>balance){
                                System.out.println("\nBakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("\nPara çekme işlemi gerçekleşti. Kalan Bakiye : "+ balance);
                            }
                            break;
                        case 3:
                            System.out.println("\nBakiyeniz : "+balance);
                            break;
                        case 4:
                            System.out.println("\nYine bekleriz");
                            break;
                    }
                } while (select!=4);
                break;

            } else {
                right --;
                System.out.println("Hatalı kullanıcı adı veya şifre.Lütfen tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Kartınız bloke oldu. BANK ile irtibata geçiniz!");
                }
            }
        }
    }

}