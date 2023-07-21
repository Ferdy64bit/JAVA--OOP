public class person {
    String name;
    String adres;
    final  String country = "indonesia";

//default construktor
    person(){
    super();
    }

    person(String name, String adres){
        super();
        this.adres=adres;
        this.name = name;
    }


    void greeting () {
        System.out.println("hello my name is " +name + ".");
        System.out.println("I, come from "+ adres +".");
    }


}
