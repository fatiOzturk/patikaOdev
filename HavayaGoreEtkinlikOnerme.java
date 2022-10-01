import java.util.Scanner;

public class HavayaGoreEtkinlikOnerme {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Hava kac derece: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if ( heat <= 25 ) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else {
                System.out.println("Piknik yapmaya gidebilirsiniz.");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}