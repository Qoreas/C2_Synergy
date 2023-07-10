package semester1.module3.homework.W8_FinalProject.data.sourse.cart;

import semester1.module3.homework.W8_FinalProject.data.models.CartItem;
import semester1.module3.homework.W8_FinalProject.data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    public abstract ArrayList<CartItem> getCart();
    public abstract void addToCart(Product product, int count);
}
