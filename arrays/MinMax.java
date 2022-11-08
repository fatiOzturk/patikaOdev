import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        int k = list[0]; // girilen sayıyı k ile değiştireceğim için k değerini saklıyorum
        int min = list[0];
        int max = list[list.length - 1];
        System.out.print("Entered Number : ");
        int number = input.nextInt();
        list[0] = number;

        if (number <= k) {
            System.out.println("There is no number in the array less than the number entered!");
            System.out.println("Big number nearest to the number entered: " +
                    (number == k ? list[1] : min));
        } else if (number >= list[list.length - 1]) {
            System.out.println("Small number nearest to the number entered: " +
                    (number == list[list.length - 1] ? list[list.length - 2] : max));
            System.out.println("There is no number in the array greater than the number entered!");
        } else {
            Arrays.sort(list);
            int index = Arrays.binarySearch(list, number);
            System.out.println("Small number nearest to the number entered: "
                    + (list[index - 1] != list[index] ? list[index - 1] : list[index - 2]));
            System.out.println("Big number nearest to the number entered: "
                    + (list[index] != list[index + 1] ? list[index + 1] : list[index + 2]));
        }
    }
}