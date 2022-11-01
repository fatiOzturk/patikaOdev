import java.util.Scanner;

public class SayiDeseni {
    static void desen(int number, int tempNumber, int result) {

        if (tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;

            if (result <= 0) {
                tempNumber = result;
            }

        } else if (tempNumber <= 0) {
            System.out.print(result + " ");
            result += 5;

            if (result == number) {
                System.out.print(result + " ");
                return;
            }

        }

        desen(number, tempNumber, result);

    }

    public static void main(String[] args) {
        int result, tempNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        while (number < 0) {
            System.out.print("0'dan büyük bir değer giriniz : ");
            number = input.nextInt();
        }

        result = number;
        tempNumber = number;
        desen(number, result, tempNumber);


    }
}