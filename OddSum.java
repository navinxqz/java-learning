import java.util.*;
public class OddSum {
    public static void Sum(int n){
        if(n<0){
            System.out.print("Invalid input");
        }int sum=0;
        for(int i=1; i<=n;i++){
            if(i%2 != 0){
                sum=sum+i;
            }
        }System.out.print("Answer: "+sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Input the limiting number: ");
        int n = sc.nextInt(); 
        Sum(n);
    }   
}