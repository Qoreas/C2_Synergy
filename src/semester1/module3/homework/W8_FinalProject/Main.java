package semester1.module3.homework.W8_FinalProject;

import semester1.module3.homework.W8_FinalProject.controller.ShopController;
import semester1.module3.homework.W8_FinalProject.data.services.ShopService;
import semester1.module3.homework.W8_FinalProject.data.sourse.cart.CartDataSource;
import semester1.module3.homework.W8_FinalProject.data.sourse.cart.MockCartDataSourceImpl;
import semester1.module3.homework.W8_FinalProject.data.sourse.catalog.CatalogDataSource;
import semester1.module3.homework.W8_FinalProject.data.sourse.catalog.MockCatalogDataSourceImpl;
import semester1.module3.homework.W8_FinalProject.data.sourse.order.MockOrderDataSourceImpl;
import semester1.module3.homework.W8_FinalProject.data.sourse.order.OrderDataSource;
import semester1.module3.homework.W8_FinalProject.view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();

        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);

        AppView addToCart = new AddToCartView(shopService);
        ArrayList<AppView> catalogChildren  = new ArrayList<>();
        catalogChildren.add(addToCart);

        AppView catalogView = new CatalogView(catalogChildren, shopService);
        AppView cartView = new CartView(shopService);
        AppView orderView = new OrderView(shopService);

        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        AppView mainView = new MainView(mainChildren);

        new ShopController(mainView).run();
    }
}
