public class Programer extends person{
    String technology;
    public Programer(){

    }
    public Programer(String name, String adres, String technology){
        super(name, adres);
        this.technology = technology;
    }
    void coding(){
        System.out.println("I can create aplication or website using : "+ technology+".");
    }
    void hacking(){
        System.out.println("I can hacking Nasa");
    }

    void greeting(){
        System.out.println("hello my name is "+name+".");
        System.out.println("I, come from "+ adres+ ".");
        System.out.println("My job is a "+technology+" doktor");
    }

}
