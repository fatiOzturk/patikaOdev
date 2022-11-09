import java.util.Scanner;

public class Palindromik {

    static boolean isPalindromik(String str) {
        // büyük-küçük harf duyarlılığını ignore ederek sorguladık (toLowerCase)
        str = str.toLowerCase();
        int first = 0;
        int last = str.length() - 1;
        while (first < last) {
            if ((str.charAt(first) != str.charAt(last))) {
                return false;
            }
            first++;
            last--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = scan.nextLine();
        System.out.println(isPalindromik(str)? "Palindromik kelimedir.":"Palindromik kelime değildir.");
    }
}