public class Main {
    public static void main(String[]args){
        person person1 = new person();
        person1.name = "hendra";
        person1.adres ="tangerang";

        teacher teacher1 = new teacher();
        teacher1.name = "budi santoso";
        teacher1.adres="jakarta";
        teacher1.subject="Pychcolog";

        teacher teacher2 = new teacher("eko","tegal","penjas");

        Dokter dokter1 = new Dokter();
        dokter1.name = "Pablo escobar";
        dokter1.adres = "mexico";
        dokter1.specialist = "kanker tulang";

        Dokter dokter2 = new Dokter("JOKO","makasar","gizi");

        Programer programer1 = new Programer();
        programer1.name = "ferdy";
        programer1.adres = "tangerang";
        programer1.technology="javaScript";

        Programer programer2 = new Programer("FAKIH","JAKARTA","SPRINGBOOT");

        programer2.greeting();
        System.out.println();

        teacher2.greeting();
        System.out.println();

        dokter2.greeting();
        System.out.println();

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
