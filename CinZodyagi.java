import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil, kalan;
        String burc = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz : ");
        yil = input.nextInt();
        kalan = yil % 12;
        switch (kalan) {
            case 0:
                burc = "maymun";
                break;
            case 1:
                burc = "horoz";
                break;
            case 2:
                burc = "Kopek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Okuz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavsan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yilan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("gecersiz giris!");
        }
        System.out.println("Cin Zodyagi Burcunuz : " + burc);
    }
}
