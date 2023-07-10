package semester1.module3.homework.W8_FinalProject.data.sourse.cart;

import semester1.module3.homework.W8_FinalProject.data.models.CartItem;
import semester1.module3.homework.W8_FinalProject.data.models.Product;

import java.util.ArrayList;

public class MockCartDataSourceImpl extends CartDataSource {
    private ArrayList<CartItem> cart = new ArrayList<>();

    @Override
    public ArrayList<CartItem> getCart() {
        return cart;
    }

    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product, count));
    }
}
