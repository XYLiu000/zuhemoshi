import java.util.ArrayList;
import java.util.List;

public class lxy33Affair extends lxy33OrganizationComponent{
    List<lxy33OrganizationComponent> lxy33OrganizationComponents=new ArrayList<lxy33OrganizationComponent>();
    public lxy33Affair(String name){
        super(name);
    }
    public void add(lxy33OrganizationComponent lxy33OrganizationComponent){
        lxy33OrganizationComponents.add(lxy33OrganizationComponent);
    }
    public void remove(lxy33OrganizationComponent lxy33OrganizationComponent){
        lxy33OrganizationComponents.remove(lxy33OrganizationComponent);
    }
    @Override
    public void print(){
        System.out.println("--------"+getName()+"-------------");
        for (lxy33OrganizationComponent lxy33OrganizationComponent:lxy33OrganizationComponents){
            lxy33OrganizationComponent.print();
        }
    }
    @Override
    public void SendMessage(String notice){
        for (lxy33OrganizationComponent lxy33OrganizationComponent:lxy33OrganizationComponents){
            lxy33OrganizationComponent.SendMessage(notice);
        }
    }
    @Override
    public void ReceiveMessage(String notice){

    }
    @Override
    public void Message(){

    }
}
