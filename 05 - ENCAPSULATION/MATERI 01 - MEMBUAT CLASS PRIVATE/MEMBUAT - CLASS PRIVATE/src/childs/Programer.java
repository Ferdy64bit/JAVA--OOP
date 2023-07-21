package childs;
import parents.person;

public class Programer extends person {
   private String technology;
    public Programer(){
        super();
    }
    public Programer(String name, String adres, String technology){
        super(name, adres);
        this.technology = technology;
    }
    public void coding(){
        System.out.println("I can create aplication or website using : "+ technology+".");
    }
    public void hacking(){
        System.out.println("I can hacking Nasa");
    }

   public void greeting(){
        super.greeting(); //greating from person
        System.out.println("My job is a "+technology+" deplovment");
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
