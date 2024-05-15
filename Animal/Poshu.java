import java.lang.*;

public class Poshu extends Animal{
	private double taka;
	
	public Poshu(){
		System.out.println("Poshu Empty");
	}
	public Poshu(String name, String color, double taka){
		super(name,color);
		this.taka=taka;
		System.out.println("Poshu pera");
	}
	public void setTaka(double taka){
		this.taka=taka;
	}public double getTaka(){
		return taka;
	}
	public void display(){
		super.display();
		System.out.println("Taka: "+taka);
	}
}