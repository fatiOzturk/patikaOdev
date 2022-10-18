import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        int result1=0, result2=1,result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını yazınız : ");
        int n = input.nextInt();
        System.out.println(n+" elemanlı Fibonacci serisi : ");
        for (int i =1;i<=n;i++){
            System.out.println(result+" ");
            result=result1+result2;
            result1=result2;
            result2=result;
        }
    }
}
