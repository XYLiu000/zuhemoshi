import com.sun.xml.internal.ws.resources.SenderMessages;
import org.omg.PortableInterceptor.ACTIVE;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        lxy33OrganizationComponent ComputerCollege=new lxy33College("计算机学院");
        lxy33OrganizationComponent MechanialCollege=new lxy33College("机械学院");
        lxy33OrganizationComponent SoftWareDeapartmant=new lxy33Deapartmant("软件工程系");
        lxy33OrganizationComponent AIDeapartmant=new lxy33Deapartmant("人工智能系");
        lxy33OrganizationComponent MechanicalDeapartmant=new lxy33Deapartmant("机械系");
        lxy33OrganizationComponent ActiveDeapartmant=new lxy33Deapartmant("能动系");


        lxy33OrganizationComponent s1=new lxy33Student("山治");
        lxy33OrganizationComponent s2=new lxy33Student("路飞");
        lxy33OrganizationComponent s3=new lxy33Student("布鲁克");
        lxy33OrganizationComponent s4=new lxy33Student("娜美");
        lxy33OrganizationComponent s5=new lxy33Student("乔巴");
        lxy33OrganizationComponent s6=new lxy33Student("索隆");
        lxy33OrganizationComponent s7=new lxy33Student("罗宾");
        lxy33OrganizationComponent s8=new lxy33Student("甚平");
        lxy33OrganizationComponent s9=new lxy33Student("弗兰奇");


        ComputerCollege.add(SoftWareDeapartmant);
        ComputerCollege.add(AIDeapartmant);

        MechanialCollege.add(MechanicalDeapartmant);
        MechanialCollege.add(ActiveDeapartmant);

        SoftWareDeapartmant.add(s1);
        SoftWareDeapartmant.add(s2);
        SoftWareDeapartmant.add(s3);

        AIDeapartmant.add(s4);
        AIDeapartmant.add(s5);

        MechanicalDeapartmant.add(s6);
        MechanicalDeapartmant.add(s7);

        ActiveDeapartmant.add(s8);
        ActiveDeapartmant.add(s9);

//        Properties pro=new Properties();
//        pro.load(new FileInputStream("src/node.properties"));
//
//        String  classname=pro.getProperty("classname");
//
//        String cn=classname;
//        Class clz=Class.forName(cn);
//        Constructor constructor=clz.getConstructor(String.class);
//        Object obj=constructor.newInstance("教务处");
//
//        Method sendMessageMethod=clz.getDeclaredMethod("SendMessage",String.class);
//        Method add=clz.getDeclaredMethod("add",lxy33OrganizationComponent.class);
//        Method print=clz.getDeclaredMethod("print");
//        add.invoke(obj,ComputerCollege);
//        add.invoke(obj,MechanialCollege);
//        print.invoke(obj);
//
//        sendMessageMethod.invoke(obj,"期末考试安排已上传，可登录教务在线查看");

                lxy33OrganizationComponent StudyAffair = new lxy33Affair("11");
                StudyAffair.add(ComputerCollege);
                StudyAffair.add(MechanialCollege);
                StudyAffair.SendMessage("123");
        MechanicalDeapartmant.SendMessage("明天有课");
        StudyAffair.print();

        s1.Message();
        s2.Message();
        s3.Message();
        s4.Message();
        s5.Message();
        s6.Message();
        s7.Message();


    }
}