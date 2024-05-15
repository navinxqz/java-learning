import java.util.*;
public class Fibonacci {
    public static void Series(int n){
        int fib1=0, fib2=1, next;
        System.out.print("Fibonacci Series: ");
        for(int i=1; i<=n; i++){
            System.out.print(fib1+" ");
            next=fib1+fib2;
            fib1=fib2;
            fib2=next;
        }return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the limiting value: ");
        int n=sc.nextInt();
        Series(n);
    }
    
}
