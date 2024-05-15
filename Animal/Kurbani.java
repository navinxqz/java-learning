import java.util.*;
import java.lang.*;

public class Kurbani{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		Poshu goat=new Poshu();
		goat.setName("Goat");
		goat.setColor("White");
		System.out.print("\nInput the goat price: ");
		double t1=sc.nextDouble();
		goat.setTaka(t1);
		
		System.out.print("Input the Cow price: ");
		double t2=sc.nextDouble();
		System.out.println("\n\t---Goat Info---");
		goat.display();
		
		System.out.println("\n\t---Cow Info---");
		Poshu cow=new Poshu("Goru","Black",t2);
		cow.display();
	}
}