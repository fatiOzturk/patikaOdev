import java.util.Arrays;

public class Count {
    public static void main(String[] args) {

        int[] arr = {13, 15, 18, 88, 63, 34, 56, 34, 63, 15, 56, 88, 13, 15, 98, 56};
        int[] storage = new int[arr.length];
        int startIndex = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
                storage[startIndex++] = arr[i];
            }
        }
        storage[count] = arr[arr.length - 1];
        count++;
        System.out.println(Arrays.toString(arr));
        System.out.println("Tekrar sayıları : ");
        for (int i = 0; i < count; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (storage[i] != 0) {
                    if (storage[i] == arr[j]) {
                        c++;
                    }
                }
            }
            System.out.println(storage[i] + " sayısı " + c + " kere tekrar edildi.");
        }
    }
}
