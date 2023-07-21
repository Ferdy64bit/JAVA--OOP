public class teacher extends person{
    String subject;
    public teacher(){

    }
    public teacher(String name, String adres, String subject){
        super(name, adres);
        this.subject = subject;
    }
    void teaching(){
        System.out.println("I can teach " + subject + " , So anyone who want to learn can talk to me.");
    }

    void greeting(){
        System.out.println("hello my name is "+name+".");
        System.out.println("I, come from "+ adres+ ".");
        System.out.println("My job is a "+subject+" teacher");
    }

}
