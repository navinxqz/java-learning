import java.util.*;
public class Vote {
    public static void Age(int n){
        if(n<=18){
            System.out.print("Not Eligible.");
        }else{
            System.out.print("Eligible.");
        }return;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Input Age: ");
        int a=sc.nextInt();

        Age(a);
    }   
}
