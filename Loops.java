import java.util.*;
public class Loops {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("For Loop: ");
        int i=0;
    for (i=0; i<11; i++){
        System.out.print(i+" ");
    }
    System.out.print("\nWhile Loop: ");
    int j=0;
    while (j<11){
        System.out.print(j+" ");
        j++;
    }
    int k=0;
    System.out.print("\nDo while Loop: ");
    do{
        System.out.print(k+" ");
        k++;
    }while(k<11);
    int sum = 0;
    System.out.print("\nInput n Natural number for addition: ");
    int c = sc.nextInt();
    for (int n=1; n<=c; n++){
        sum = sum+n;
    }
    System.out.println(sum);
    System.out.print("\nInput a number: ");
    int x= sc.nextInt();
    for (int p=1; p<=10;p++){
      System.out.println(x*p);  
    }
    }
}
