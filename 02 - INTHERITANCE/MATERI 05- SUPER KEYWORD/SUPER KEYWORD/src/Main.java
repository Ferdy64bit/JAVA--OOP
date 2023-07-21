public class Main {
    public static void main(String[]args){
        person person1 = new person();
        person1.name = "hendra";
        person1.adres ="tangerang";

        teacher teacher1 = new teacher();
        teacher1.name = "budi santoso";
        teacher1.adres="jakarta";
        teacher1.subject="Pychcolog";

        Dokter dokter1 = new Dokter();
        dokter1.name = "Pablo escobar";
        dokter1.adres = "mexico";
        dokter1.specialist = "kanker tulang";

        Programer programer1 = new Programer();
        programer1.name = "ferdy";
        programer1.adres = "tangerang";
        programer1.technology="javaScript";

        person1.greeting();
        System.out.println();

        teacher1.greeting();
        System.out.println();

        dokter1.greeting();
        System.out.println();

        programer1.greeting();
        System.out.println();

    }
}
