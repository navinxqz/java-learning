import java.util.*;
public class BasicCalculator {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd number: ");
        int b = sc.nextInt();

        System.out.println("What operation you want to do:");
        System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Remainder");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        double sum;

        switch(choice){
            case 1: sum = a+b;
            System.out.println(sum);
            break;
            case 2: sum = a-b;
            System.out.println(sum);
            break;
            case 3: sum = a*b;
            System.out.println(sum);
            break;
            case 4: sum = a/b;
            System.out.println(sum);
            break;
            case 5: sum = a%b;
            System.out.println(sum);
            break;
            default: System.out.println("Invalid choice!!!");
        }
    }
}
