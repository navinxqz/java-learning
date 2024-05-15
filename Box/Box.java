import java.lang.*;
public class Box{
	
	private float length;
	private float weidth;
	private float height;
	
	public Box(){
		System.out.println("Empty cons");
	}
	public Box(float length,float weidth,float height){
		this.length=length;
		this.weidth=weidth;
		this.height=height;
		System.out.println("Pera cons");
	}
	
	public void setLength(float length){
		this.length=length;
	}public float getLength(){
		return length;
	}
	public void setWeidth(float weidth){
		this.weidth=weidth;
	}public float getWeidth(){
		return weidth;
	}
	public void setHeight(float height){
		this.height=height;
	}public float getHeight(){
		return height;
	}
	
	public void display(){
		System.out.println("\n\tLength: "+length+"\n\tWeidth: "+weidth+"\n\tHeight: "+height+"\n\n");
	}
}