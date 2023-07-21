package backendjavajunit.ej01;

public class Product {
    
    private static int idCount = 1001;
    private int id;
    private int price;

    public Product(int price) {
        this.id = idCount++;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
