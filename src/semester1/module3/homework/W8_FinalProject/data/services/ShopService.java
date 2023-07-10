package semester1.module3.homework.W8_FinalProject.data.services;

import semester1.module3.homework.W8_FinalProject.data.models.CartItem;
import semester1.module3.homework.W8_FinalProject.data.models.Order;
import semester1.module3.homework.W8_FinalProject.data.models.Product;
import semester1.module3.homework.W8_FinalProject.data.sourse.cart.CartDataSource;
import semester1.module3.homework.W8_FinalProject.data.sourse.catalog.CatalogDataSource;
import semester1.module3.homework.W8_FinalProject.data.sourse.order.OrderDataSource;

import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(
            CatalogDataSource catalogDataSource,
            CartDataSource cartDataSource,
            OrderDataSource orderDataSource
    ) {
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();
    }

    public ArrayList<CartItem> getCart() {
        return cartDataSource.getCart();
    }

    public boolean addToCart(String productID, int count) {
        ArrayList<Product> products = getCatalog();

        for (Product p : products) {
            if (p.id.equals(productID) && p.available) {
                cartDataSource.addToCart(p, count);
                return true;
            }
        }

        return false;
    }

    public void createOrder(String name, String phone, String address, String paymentType, String deliveryTime) {
        ArrayList<CartItem> cartItems = getCart();
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cartItems);
        orderDataSource.createOrder(newOrder);
    }
}
