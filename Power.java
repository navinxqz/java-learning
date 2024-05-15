import java.util.*;
public class Power {
    public static void Num(int x, int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }System.out.print(x+" to the power "+n+" = "+result);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        Num(x,n);
    }
}
