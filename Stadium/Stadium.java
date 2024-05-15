import java.util.*;
import java.lang.*;

public class Stadium{
private String name;
private String id;
private int seat;

//setter-getter
public void setName(String name){
this.name=name;
}public String getName(){
return name;
}
public void setId(String id){
this.id=id;
}public String getId(){
return id;
}
public void setSeat(int seat){
	this.seat=seat;
}public int getSeat(){
	return seat;
}
//constructor
public Stadium(){
	System.out.println("Constructor Call!");
}
public Stadium(String name,String id,int seat){
	this.name=name;
	this.id=id;
	this.seat=seat;
}
public void info(){
	System.out.println("\t[Registered]\n\tStadium Info:");
System.out.println("Name: "+getName()+"\nID: "+getId()+"\nSeat: "+getSeat()+"\n");
}
}