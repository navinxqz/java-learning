import java.util.*;
public class SearchFrom2DArray {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input row size: ");
        int row = sc.nextInt();
        System.out.print("Input column size: ");
        int col=sc.nextInt();

        int[][] num= new int[row][col];
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.print("Input the searching number: ");
        int x = sc.nextInt();
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==x){
                    System.out.print(x+" is in index: "+i+","+j);
                }System.out.println();  
                }
            }
        }
    }
