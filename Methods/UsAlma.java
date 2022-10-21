import java.util.Scanner;

public class UsAlma {
    static int power(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        }

        return power(a,b-1)*a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print("kuvvetini giriniz : ");
        int b = input.nextInt();
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}


