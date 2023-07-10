package semester1.module3.homework.W8_FinalProject.view;

import semester1.module3.homework.W8_FinalProject.data.models.CartItem;
import semester1.module3.homework.W8_FinalProject.data.models.Product;
import semester1.module3.homework.W8_FinalProject.data.services.ShopService;

import java.util.ArrayList;

public class CartView extends AppView{
    final ShopService shopService;

    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();

        for (CartItem item : cart) {
            System.out.println(
                    item.count + ": " + item.product.tittle + " - " + item.product.price + '.'
            );
        }
        System.out.println();
    }
}
