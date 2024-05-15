public class ConstructorExample {
 private int id;
 private String name;
 public ConstructorExample(){
 }public ConstructorExample(int i, String n){
    id = i;
    name = n;
 }
 public void displayInfo(){
    System.out.println("Name is: "+name);
    System.out.println("Id is: "+id);
 }
 public static void main(String args[]){
    
    ConstructorExample p1= new ConstructorExample(103,"Alom");
    p1.displayInfo();
 }
}
