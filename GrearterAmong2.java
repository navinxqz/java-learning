import java.util.*;
public class GrearterAmong2 {
    public static void Greater(int a,int b){
        if(a==b){
            System.out.print("Both are Equal.");
        }else if(a>b){
            System.out.print(a+" is greater than "+b);
        }else{
            System.out.print(b+" is greater than "+a);
        }return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Input 2 numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        Greater(a, b);
    }
}
