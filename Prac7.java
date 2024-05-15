import java.util.*;
public class Prac7{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Input number: ");
        int n= sc.nextInt();
//upper side
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        int space = 2*(n-i);
        for(int j=1; j<=space;j++){
            System.out.print("  ");
        }for(int j=1; j<=i; j++){
            System.out.print("* ");
        }System.out.println();
    }
//lower side
    for(int i=n; i>=1; i--){
        for(int j=i; j>=1; j--){
            System.out.print("* ");
        }
        int space = 2*(n-i);
        for(int j=space; j>=1;j--){
            System.out.print("  ");
        }for(int j=i; j>=1; j--){
            System.out.print("* ");
        }System.out.println();
    }
}
}