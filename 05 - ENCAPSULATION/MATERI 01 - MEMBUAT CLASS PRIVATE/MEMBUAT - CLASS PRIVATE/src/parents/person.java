package parents;

public class person {
    private String name;
    private String adres;


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
    //setter and getter
    public String getName(){
     return this.name;
    }
    public void setName(String name){
     this.name = name;
    }
    public String getAdres(){
     return this.adres;
    }
    public void setAdres(String adres){
     this.adres = adres;
    }

}
