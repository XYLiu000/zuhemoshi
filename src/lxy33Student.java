import java.util.ArrayList;
import java.util.List;

public class lxy33Student extends lxy33OrganizationComponent{
    ArrayList<String> notes=new ArrayList<>();
    public lxy33Student(String name){
        super(name);
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public void print(){
        System.out.println(getName());
    }
    @Override
    public void SendMessage(String notice){

    }
    @Override
    public void ReceiveMessage(String notice){
        notes.add(notice);
    }
    @Override
    public void Message(){
        System.out.println(getName()+"同学的消息列表"+notes);
    }
}
