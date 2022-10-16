import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number : ");
        int number = input.nextInt();
        double i=1;
        double total=0;
        while(i<=number){
            total+=(1/i);
            i++;
        }
        System.out.println("Harmonic number of "+number+" is : "+total);
    }
}