import java.util.*;
public class Counter {
    public static void main(String args[]){
        int positive = 0 ,negative = 0, zero= 0;
        System.out.print("Press 1 to continue or 0 to end");
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        while(n==1){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }else{
                zero++;
            }
            System.out.print("Press 1 to continue or 0 to end");
            n=sc.nextInt();
        }
        System.out.println("Positives: "+positive);
        System.out.println("Negatives: "+negative);
        System.out.println("Zeros:"+zero);
    }
}
