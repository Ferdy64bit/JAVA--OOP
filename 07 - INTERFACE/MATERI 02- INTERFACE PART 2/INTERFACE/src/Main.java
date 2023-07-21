import Interface.Phone;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Phone redminote10 = new Xiaomi();
       PhoneUser dian = new PhoneUser(redminote10);
       dian.turnOnThePhone();
        Scanner input = new Scanner(System.in);
       String aksi;
       boolean isLooping = true;

       do {
           System.out.println("========aplikasi Interface ========");
           System.out.println("[1] nyalakan hp");
           System.out.println("[2] matikan hp");
           System.out.println("[3] perbesar volume");
           System.out.println("[4] perkecil volume");
           System.out.println("[0] keluar");
           System.out.println("==================================");

           System.out.println("pilih aksi : ");
           aksi = input.next();
           if (aksi.equalsIgnoreCase("1")){
               dian.turnOnThePhone();
           } else if (aksi.equalsIgnoreCase("2")) {
               dian.turnOffThePhone();
           } else if (aksi.equalsIgnoreCase("3")) {
               dian.makePhoneLounder();
           } else if (aksi.equalsIgnoreCase("4")) {
               dian.makePhoneSilent();
           }else {
               System.out.println("aksi yang anda pilih tidak tersedia silakan pilih aksi kembali");
           }
       }while (isLooping);
    }
}