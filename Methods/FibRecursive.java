import java.util.Scanner;

public class FibRecursive {
    static int fib(int n) {
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21
        //f(1)=1
        //f(2)=1
        //f(n)= f(n-1)+f(n-2)
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak giriniz : ");
        int a= input.nextInt();
        for (int i=1;i<=a;i++){
            System.out.print(fib(i)+ " ");
        }
    }
}