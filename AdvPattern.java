public class AdvPattern {
    public static void main(String args[]){
        int n=4;
        //upper half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print("  ");
            }for(int j=1; j<=i;j++){
                System.out.print("* ");
            }System.out.println();    
        }
        //lower half
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1;j--){
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for(int j=space; j>=1;j--){
                System.out.print("  ");
            }for(int j=i; j>=1;j--){
                System.out.print("* ");
            }System.out.println();
    }}}
