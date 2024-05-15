import java.util.*;;

public class ArrayPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size= sc.nextInt();
        int num[]= new int[size];
//input
        for(int i=0;i<size;i++){
            System.out.print("Input for "+(i+1)+" : ");
            num[i] = sc.nextInt();
            }
//output
System.out.print("Input the number to search: ");            
int x=sc.nextInt();
            for(int i=0; i<size;i++){
                if (num[i]==x){
                System.out.println(x+" found at index "+(i+1));
            }}
}
}
