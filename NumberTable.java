import java.util.*;
public class NumberTable {
    public static void Table(int n){
        for(int i=1; i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        Table(n);
    } 
}