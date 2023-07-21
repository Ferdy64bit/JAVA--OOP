public class person {
    String name;
    String adres;
    final  String country = "indonesia";

//default construktor
    person(){

    }

    person(String paramName){
        name = paramName;
    }

//    counstrucktor param
    person(String name, String adres){
        this.name = name;
        this.adres= adres;
    }

    void sayHello (String paramName) {
        System.out.println("hello " + paramName + ",my name is " + name + ".");
    }

    String sayDress(){
        return "I, come from "+ adres;
    }

}
