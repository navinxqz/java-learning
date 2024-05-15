import java.util.*;
public class Factorial {
    public static int Function(int n){
        if(n<0){
            System.out.print("Invalid Number!");
            return 0;
        }
        int sum=1;
        for(int i=n; i>=1;i--){
        sum=sum*i;
        }return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input the Number: ");
        int n=sc.nextInt();

        System.out.print("Answer: "+ Function(n));
    }
    
}
