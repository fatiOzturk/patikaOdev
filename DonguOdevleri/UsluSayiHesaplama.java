import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String []args){
        int m,n,total =1;
        Scanner input = new Scanner(System.in);
        System.out.print("m : ");
        m = input.nextInt();
        System.out.print("n : ");
        n = input.nextInt();
        for (int i =1;i<=n;i++){
            total *=m;
        }
        System.out.println(m+"^"+n+" = "+ total);
    }
}
