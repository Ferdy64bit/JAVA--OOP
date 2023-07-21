// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//      counstuctor param

        person person1 = new person("ferdy " ," tangerang");
        person1.sayHello("padepokan 79");
        System.out.println(person1.sayDress());

        person person2 = new person();
        person2.name= "ferdy ";
        person2.adres="tangerang";
        person2.sayHello("padepokan 79");
        System.out.println(person2.sayDress());

        person person3 = new person("budi");
        person3.adres="jakarta";
        person3.sayHello("hay kamu");
        System.out.println(person3.sayDress());



    }
}