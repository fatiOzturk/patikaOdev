import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int col = input.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpozMatris = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((i + 1) + ". satırın " + (j + 1) + ". elemanını giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }
        System.out.println("Girilen matrisin transpozu : \n");
        for (int[] val : transpozMatris) {
            for (int k : val) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}