import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1;i<=n;i++){
            for (int j = 1; j<=i;j++) {
                System.out.print(" ");
            }
            for (int k = i; k<= (2*(n-1))-i ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
/*
            Alternatif bir algoritmayı da buraya bırakıyorum (azalan yıldızlar için)
        for (int i = n - 1; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        } */

    }
}