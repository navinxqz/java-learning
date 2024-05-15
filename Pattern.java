import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=4; i++){
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();

        for (int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i==1 ||i==4 ||j==1 ||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }System.out.println();

        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();

        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }System.out.println();
        }System.out.println();

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }System.out.println();

        int counter=1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }System.out.println();
        }System.out.println();

        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }System.out.println();
    }
}
    
}
