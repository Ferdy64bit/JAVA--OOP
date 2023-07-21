package childs;
import parents.product;


public class Item extends product {
    private int price;

    public Item(){

    }

    public Item(String name, int price){
        super(name);
        this.price = price;
    }

    public void printInformation(){
        System.out.println("product Name : "+ getName() );
        System.out.println("product Price : "+ getPrice() );
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

