import java.util.*;
import java.lang.*;
public class start{
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Input the Height of 1st box: ");
		float h1=sc.nextFloat();
		System.out.print("Input the Length of 2nd box: ");
		float l2=sc.nextFloat();
		
		Box b1 = new Box();
		Box b2 = new Box(l2,200.23F,66.99F);
		
		b1.setLength(103.20F);
		b1.setWeidth(605.00F);
		b1.setHeight(h1);
		
		Box boxes[]=new Box[4];
		boxes[0]=b1;
		boxes[3]=b2;
		boxes[2]=new Box(274.67F,47.47F,7.38F);
		
		for(int i=0;i<boxes.length;i++)
		{
			if(boxes[i]==null){
				System.out.println("Empty value box detected");
				System.out.print("Input Length for box "+i+" : ");
				float v1 = sc.nextFloat();
				System.out.print("Input Weidth for box "+i+" : ");
				float v2 = sc.nextFloat();
				System.out.print("Input Height for box "+i+" : ");
				float v3 = sc.nextFloat();
				
				boxes[i] = new Box(v1,v2,v3);
				System.out.println("New Value Suuceesfully set!\nDetails for new box : ");
			}else{
				System.out.println("Already Inserted!");
			}
		}
			for(int i=0;i<boxes.length;i++){
				if(boxes[i] != null){
					boxes[i].display();
			}
		}	
	}
}