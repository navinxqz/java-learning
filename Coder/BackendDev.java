import java.lang.*;
public class BackendDev extends Programmer {
    private String id;
    private String assignTask;
    private String completeTask;

    public BackendDev(){
        System.out.println("Call from empty cons backenddev");
    }
    public BackendDev(String name,String email,String id,String assignTask,String completeTask){
        super(name,email);
        System.out.println("Call from pera cons backenddev");
    }
     public void setId(String id){
        this.id=id;
    }public String getId(){
        return id;
    }
    public void setAssignTask(String assignTask){
        this.assignTask=assignTask;
    }public String getAssignTask(){
        return assignTask;
    }
    public void setCompleteTask(String CompleteTask){
        this.completeTask=completeTask;
    }public String getCompleteTask(){
        return completeTask;
    }
    public void ViewDetails(){
        super.ViewDetails();
        System.out.println("ID: "+id+"\nAssign Task: "+assignTask+"\nComplete Task: "+completeTask+"\n");
    }
}
