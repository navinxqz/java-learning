import java.lang.*;
public class Animal{
	private String name;
	private String color;
	
	public Animal(){
		System.out.println("Animal empty cons");
	}
	public Animal(String name,String color){
		this.name=name;
		this.color=color;
		System.out.println("Animal pera cons");
	}
	public void setName(String name){
		this.name=name;
	}public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color=color;
	}public String getColor(){
		return color;
	}
	public void display(){
		System.out.println("Name: "+name+"\nColor: "+color);
		}
}