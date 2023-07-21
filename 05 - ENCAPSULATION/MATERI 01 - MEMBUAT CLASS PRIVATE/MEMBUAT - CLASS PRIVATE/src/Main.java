import childs.Dokter;
import childs.teacher;
import parents.person;
import childs.Programer;

public class Main {
    public static void main(String[] args) {
        person person1 = new Programer("Ferdy", "Tangerang", "Node.js");
        person person2 = new teacher("amel","tangerang","matematika");
        person person3 = new Dokter("amel","jakarta","GIGI");

//        System.out.println(((Programer)person1).technology);

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void sayHello(person person) {
        String message;
        if (person instanceof Programer) {
            Programer programmer = (Programer) person;
            message = "Hello," + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
        } else if (person instanceof teacher) {
            teacher teacher = (teacher) person;
            message = "Hello," + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
        } else if (person instanceof Dokter) {
            Dokter doctor = (Dokter) person;
            message = "Hello," + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
        } else {
            message = "Hello, " + person.getName() + ".";
        }
        System.out.println(message);
    }
}