package parents;

public class person {
   public String name;
    public String adres;


//default construktor

 public person(String name, String adres){
        super();
        this.adres=adres;
        this.name = name;
    }

    public person(){
     super();
    }


   public void greeting () {
        System.out.println("hello my name is " +name + ".");
        System.out.println("I, come from "+ adres +".");
    }


}
