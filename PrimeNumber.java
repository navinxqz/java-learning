import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number to check it's a prime number or not: ");
        int n = sc.nextInt();

        int counter= 0;
        for(int i=2; i<n; i++){
            if( n%i == 0){
                counter++;
            }}
            if(counter==0){
                System.out.print("This is a prime number.");         
            }else{
                System.out.print("This is not a prime number.");
            }
        }
    }
