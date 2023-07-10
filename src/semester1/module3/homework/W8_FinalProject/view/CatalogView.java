package semester1.module3.homework.W8_FinalProject.view;

import semester1.module3.homework.W8_FinalProject.data.models.Product;
import semester1.module3.homework.W8_FinalProject.data.services.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {
    final ShopService shopService;

    public CatalogView(ArrayList<AppView> children, ShopService shopService) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();

        for (Product p : catalog) {
            System.out.println(p.id + ": " + p.tittle + " - " + p.price + '.');
        }
        System.out.println();
    }
}
