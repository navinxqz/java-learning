import java.util.*;
public class FunctionPractice {

    public static int ownFunction(int a, int b){
        int sum=a+b;
        System.out.print("Answer: "+sum);
        return sum;
    } 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your 2 numbers: ");
        int a =sc.nextInt();
        int b=sc.nextInt();

        ownFunction(a,b);

    }
    
}
