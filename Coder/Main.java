import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String args[]){
        FrontendDev F=new FrontendDev();
        BackendDev B=new BackendDev("Alom","xy@gamil.com","27674","Finished","Finished");
        F.setName("Kalam");
        F.setEmail("ab@gamil.com");
        F.setId("357935");
        F.setAssignTask("Handed");
        F.setCompleteTask("Done");

        F.ViewDetails();
        B.ViewDetails();
    }
    
}
