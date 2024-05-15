import java.util.*;
import java.lang.*;

public class main{
	public static void main(String args[]){
		Scanner sc= new Scanner (System.in);
		
System.out.print("Input Stadium name: ");
String s=sc.next();
System.out.print("Input ID: ");
String id=sc.next();
System.out.print("Input Seats: ");
int seat=sc.nextInt();

Stadium g1= new Stadium(s,id,seat);
g1.info();

Stadium g2=new Stadium();
System.out.print("Input Stadium name: ");
g2.setName(sc.next());
System.out.print("Input ID: ");
g2.setId(sc.next());
System.out.print("Input Seats: ");
g2.setSeat(sc.nextInt());

g2.info();
	}
}