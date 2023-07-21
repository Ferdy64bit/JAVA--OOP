public class Dokter extends person{
    String specialist;
    public Dokter(){

    }
    public Dokter(String name, String adres, String specialist){
        super(name, adres);
        this.specialist = specialist;
    }
    void surgery(){
        System.out.println("I can surgery opration patients");
    }

    void greeting(){
        super.greeting();
        System.out.println("My job is a "+specialist+" doktor");
    }


}
