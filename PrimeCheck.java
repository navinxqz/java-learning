import java.util.*;
public class PrimeCheck {
    public static void Prime(int n){
        if(n%2==0){
            System.out.print("This is a even number.");
        }else{
            System.out.print("This is not a even number.");
        }return ;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("INput a number: ");
        int n = sc.nextInt();

        Prime(n);
    }

    
}
