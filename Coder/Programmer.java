import java.lang.*;
public class Programmer {
    private String name;
    private String email;

    public Programmer(){
        System.out.println("Call from empty cons programmer");
    }
    public Programmer(String name,String email){
        this.name=name;
        this.email=email;
        System.out.println("Call from pera cons programmer");
    }
    public void setName(String name){
        this.name=name;
    }public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }public String getEmail(){
        return email;
    }
    public void ViewDetails(){
        System.out.println("Name: "+name+"\nEmail: "+email);
    }
}
