package childs;
import parents.person;


public class Dokter extends person {
   public String specialist;
    public Dokter(){

    }
    public Dokter(String name, String adres, String specialist){
        super(name, adres);
        this.specialist = specialist;
    }
  public void surgery(){
        System.out.println("I can surgery opration patients");
    }

   public void greeting(){
        super.greeting();
        System.out.println("My job is a "+specialist+" doktor");
    }


}
