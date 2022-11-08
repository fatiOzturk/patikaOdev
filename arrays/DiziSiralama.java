import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi kaç boyutlu olacak : ");
        int n = input.nextInt();

        int [] list = new int[n];
        for (int i =0; i< list.length;i++){
            System.out.print((i+1)+". Elemanı giriniz : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        System.out.println(Arrays.toString(list));
    }
}