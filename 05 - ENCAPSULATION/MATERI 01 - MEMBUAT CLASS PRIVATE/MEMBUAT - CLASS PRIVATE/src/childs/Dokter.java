package childs;
import parents.person;


public class Dokter extends person {
   private String specialist;
    public Dokter(){

    }
    public Dokter(String name, String adres, String specialist){
        super(name, adres);
        this.specialist = specialist;
    }
  public void surgery(){
        System.out.println("I can surgery opration patients");
    }

    public void greeting () {
        System.out.println("hello my name is " +getName() + ".");
        System.out.println("I, come from "+ getAdres() +".");
    }

    public String getSpecialist(){
        return this.specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
