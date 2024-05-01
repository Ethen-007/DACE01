import java.util.Scanner;

public class Fibonacci {
    public static void fibo(int a,int b,int n) {
        if(n==0){
            return; //break case
        }
        int c =a+b;
        System.out.print( c+" ");
        n--;
        fibo(b,c,n);
    }
    public static void main(String[] args){
        System.out.println("Enter the number of terms:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0, b =1;
        System.out.print(a + " " + b+" ");
        fibo(a,b,n-2);
    }
}
