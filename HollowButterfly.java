public class HollowButterfly {
    public static void main(String args[]){
        int n = 5;
        //Left part
        for(int i = 1;i<=n;i++){
           for(int j=1; j<=i;j++){
                if(i==1||j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                if(i==1||j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        //Right Part
        
    }
}
