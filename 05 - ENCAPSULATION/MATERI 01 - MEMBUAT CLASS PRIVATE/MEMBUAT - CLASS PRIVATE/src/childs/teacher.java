package childs;
import parents.person;

public class teacher extends person {
   private String subject;
    public teacher(){

    }
    public teacher(String name, String adres, String subject){
        super(name, adres);
        this.subject = subject;
    }
    void teaching(){
        System.out.println("I can teach " + subject + " , So anyone who want to learn can talk to me.");
    }

    public void greeting () {
        System.out.println("hello my name is " +getName() + ".");
        System.out.println("I, come from "+ getAdres() +".");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
