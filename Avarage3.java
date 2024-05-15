import java.util.*;
public class Avarage3 {
    public static float Avg(int a,int b,int c){
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input 3 numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        System.out.print("Avarage: "+Avg(a, b, c));
    }
}
