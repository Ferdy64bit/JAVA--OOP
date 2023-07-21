import childs.Circle;
import childs.Triangle;
import parents.Shape;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Shape lingkaran = new Circle ("Biru", 20);
Shape segitiga = new Triangle (10, 15, "Merah");

        System.out.println("Luas lingkaran berwarna " + lingkaran.getColor()+ " adalah "+ lingkaran.getArea());
        System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());




    }
}