package semester1.module3.homework.W8_FinalProject.data.models;

public class CartItem {
    public final Product product;
    public final int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
