public abstract class lxy33OrganizationComponent
{
    String Name;
    public lxy33OrganizationComponent(String name){
        Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }
    public void add(lxy33OrganizationComponent lxy33organizationcomponent){
        throw new UnsupportedOperationException();
    }
    public void remove(lxy33OrganizationComponent lxy33organizationcomponent){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
    public abstract void SendMessage(String notice);
    public abstract void ReceiveMessage(String notice);
    public abstract void Message();
}
