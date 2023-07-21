public class person {
    String name;
    String adres;
    final  String country = "indonesia";

//default construktor
    person(){

    }

//    counstrucktor param
    person(String paramName, String paramAddress){
        name = paramAddress;
        adres = paramName;
    }

    void sayHello (String paramName) {
        System.out.println("hello " + paramName + ",my name is " + name + ".");
    }

    String sayDress(){
        return "I, come from "+ adres;
    }

}
