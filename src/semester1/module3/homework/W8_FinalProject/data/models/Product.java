package semester1.module3.homework.W8_FinalProject.data.models;

public class Product {
    public final String id;
    public final String tittle;
    public final String description;
    public final int price;
    public boolean available;

    public Product(String id, String tittle, String description, int price, boolean available) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.price = price;
        this.available = available;
    }
}
