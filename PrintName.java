import java.util.*;
public class PrintName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of workers: ");
        int size = sc.nextInt();
        System.out.println("Input names below: ");
        String name[] = new String[size];
        //input
        for(int i=0; i<size;i++){
            name[i]= sc.next();
        }
        //output
        for(int i=0; i<size;i++){
            System.out.println("Hello Mr. "+(i+1)+" : "+ name[i]);
        }
    }
    
}
