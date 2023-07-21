package childs;
import parents.person;

public class teacher extends person {
   public String subject;
    public teacher(){

    }
    public teacher(String name, String adres, String subject){
        super(name, adres);
        this.subject = subject;
    }
    void teaching(){
        System.out.println("I can teach " + subject + " , So anyone who want to learn can talk to me.");
    }

  public   void greeting(){
        super.greeting();
        System.out.println("My job is a "+subject+" teacher");
    }

}
