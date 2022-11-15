import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz ");
        System.out.print("Satır sayısı : ");
        row = input.nextInt();
        System.out.print("Sütun sayısı : ");
        col = input.nextInt();

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();
    }
}