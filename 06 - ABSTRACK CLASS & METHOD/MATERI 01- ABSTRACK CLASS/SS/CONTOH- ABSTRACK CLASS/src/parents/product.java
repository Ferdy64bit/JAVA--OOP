package parents;

public abstract class product {
    private String name;
    public product() {
    }

    public product(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    //abstract method
    public abstract void printInformation();
}

